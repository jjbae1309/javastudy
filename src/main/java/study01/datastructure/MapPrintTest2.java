package study01.datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapPrintTest2 {
	private static Logger LOGGER = LoggerFactory.getLogger(MapPrintTest2.class);
	
	public static void main(String[] args) {
		Map<String, String> testMap = new HashMap<>();
		
		testMap.put("AAA", "배재준");
		testMap.put("BBB", "배재율");
		testMap.put("CCC", "배수현");
		
		Set<String> keySet = testMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String onekey = iterator.next();
			String value = testMap.get(onekey);
			
			LOGGER.debug(String.format("[%s]:%s", onekey, value));
		}
	}
}
