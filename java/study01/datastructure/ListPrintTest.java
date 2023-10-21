package study01.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListPrintTest {
	private static Logger LOGGER = LoggerFactory.getLogger(ListPrintTest.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> testList = new ArrayList<>();
		
		testList.add(111);
		testList.add(222);
		testList.add(222);
		testList.add(333);
		
		Iterator<Integer> iter = testList.iterator();
		while (iter.hasNext()) {
			int value = iter.next();
			
			//LOGGER.debug("value: " + value);
			LOGGER.debug(Integer.toString(value));
		}
		
//		int size = testList.size();
//		for (int i = 0; i < size; i++) {
//			int value = testList.get(i);
//			
//			LOGGER.debug(Integer.toString(value));
//		}
		
		for (int value : testList) {
			LOGGER.debug(Integer.toString(value));
		}
	}
}
