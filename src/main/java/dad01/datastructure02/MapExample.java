package dad01.datastructure02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("����", 88);
		map.put("ö��", 92);
		map.put("����", 90);
		map.put("�̿�", 75);
		map.put("����", 94);
		
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);
			System.out.println("[" + key + "]:" + value);
		}
	}
}
