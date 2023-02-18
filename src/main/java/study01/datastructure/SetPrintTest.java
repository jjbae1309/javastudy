package study01.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetPrintTest {
	private static Logger LOGGER = LoggerFactory.getLogger(SetPrintTest.class);
	
	public static void main(String[] args) {
		Set<String> testSet = new HashSet<>();
		testSet.add("111");
		testSet.add("111");
		testSet.add("222");
		testSet.add("333");
		
//		Iterator<String> iter = testSet.iterator();
//		while (iter.hasNext()) {
//			String oneValue = iter.next();
//			
//			LOGGER.debug(oneValue);
//		}
		
		for (String oneValue : testSet) {
			LOGGER.debug(oneValue);
		}
	}
}
