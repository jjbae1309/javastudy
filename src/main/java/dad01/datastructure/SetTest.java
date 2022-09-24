package dad01.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import dad01.datastructure02.Person;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		//Set<Integer> s = new LinkedHashSet<>();
		s.add(10);
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		
		Iterator<Integer> iter = s.iterator();
		while (iter.hasNext()) {
			int v = iter.next();
			
			System.out.println(v);
		}
		
		Person p1 = new Person();
		p1.name
	}
}
