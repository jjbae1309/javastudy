package study01.datastructure;

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
		testMap.put("BBB", "배재율");
		testMap.put("CCC", "배수현");
		
		// key의 집합을 가져온다.
		Set<String> keySet = testMap.keySet();
		
		// 반복자를 만든다.
		Iterator<String> iterator = keySet.iterator();
	
		//반복자를 통해 반복한다.
		while (iterator.hasNext()) {
			// key의 값을 구한다.
			String onekey = iterator.next();
			String value = testMap.get(onekey);
			
			LOGGER.debug(String.format("[%s]:%s", onekey, value));
		}
	}
}
