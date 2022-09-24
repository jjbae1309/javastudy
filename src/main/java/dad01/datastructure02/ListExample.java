package dad01.datastructure02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(88);
		list.add(92);
		list.add(90);
		list.add(75);
		list.add(94);
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------");
		
		Collections.sort(list);
		
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
