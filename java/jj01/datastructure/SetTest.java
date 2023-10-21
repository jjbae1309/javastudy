package jj01.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		
		Iterator<Integer> iter = s.iterator();
		while (iter.hasNext()) {
			int v = iter.next();
			
			System.out.println(v);
		}
	}
}
