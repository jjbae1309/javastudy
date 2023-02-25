package study01.datastructureHomework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapPrintTest {
	private static Logger LOGGER = LoggerFactory.getLogger(MapPrintTest.class);
	
	public static void main(String[] args) {
		Map<String, String> testMap = new HashMap<>();
		
		testMap.put("AAA", "배재준");
		testMap.put("BBB", "배수현");
		testMap.put("CCC", "배재율");
		
		Set<String> keySet = testMap.keySet();
		Iterator<String> iter = keySet.iterator();
		
		while (iter.hasNext()) {
			String onekey = iter.next();
			String value = testMap.get(onekey);
			
			LOGGER.debug(String.format("[%s]:%s", onekey, value));
		}
	}	
}
