package dad01.datastructure02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("¿µÈñ", 88);
		map.put("Ã¶¼ö", 92);
		map.put("¼öÁö", 90);
		map.put("¹Ì¿µ", 75);
		map.put("ÁöÇı", 94);
		
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);
			System.out.println("[" + key + "]:" + value);
		}
	}
}
