package study01.datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapPrintTest3 {
	private static Logger LOGGER = LoggerFactory.getLogger(MapPrintTest3.class);
	
	public static void main(String[] args) {
		Map<Integer, String> phoneMap = new HashMap<>();
		
		phoneMap.put(82, "Korea");
		phoneMap.put(1, "USA");
		phoneMap.put(81, "Japan");
		phoneMap.put(86, "China");
		
//		Set<Integer> keySet = phoneMap.keySet();
//		Iterator<Integer> iter = keySet.iterator();
//		while (iter.hasNext()) {
//			int oneKey = iter.next();
//			String value = phoneMap.get(oneKey);
//			
//			LOGGER.debug(String.format("[%3s] %s", oneKey, value));
//		}
		
		for (Integer oneKey : phoneMap.keySet()) {
			String value = phoneMap.get(oneKey);
			LOGGER.debug(String.format("[%3s] %s", oneKey, value));
		}
	}
}