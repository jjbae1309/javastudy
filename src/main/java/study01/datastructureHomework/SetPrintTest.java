package study01.datastructureHomework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetPrintTest {
	private static Logger LOGGER = LoggerFactory.getLogger(SetPrintTest.class);
		public void main(String[] args) {
		
	
	Set<String> testSet = new HashSet<>();
		testSet.add("111");
		testSet.add("222");
		testSet.add("333");
		testSet.add("444");
		
		Iterator<String> iter = testSet.iterator();
		while (iter.hasNext()) {
			String oneValue = iter.next();
			LOGGER.debug(oneValue);	
		}
	}	
}
