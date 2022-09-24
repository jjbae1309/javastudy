package dad01.datastructure02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		
		Student s1 = new Student();
		s1.setId("10216");
		s1.setName("배재준");
		s1.setKor(100);
		s1.setEng(100);
		s1.setMath(100);
		s1.setSci(0);
		
		map.put(s1.getId(), s1);

		Student s2 = new Student();
		s2.setId("10217");
		s2.setName("배재율");
		s2.setKor(1);
		s2.setEng(1);
		s2.setMath(1);
		s2.setSci(0);
		
		map.put(s2.getId(), s2);
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Student value = map.get(key);
			
			System.out.println("[" + key + "]:" + value);
		}
	}
}
