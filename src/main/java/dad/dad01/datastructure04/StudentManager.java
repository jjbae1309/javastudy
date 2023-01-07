package dad01.datastructure04;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
	private Map<String, Student> studentRepo = new HashMap<>();
	
	public StudentManager() {
		// µ¥ÀÌÅÍ ·Îµù
		initData();
	}
	
	private void initData() {
		Student s1 = new Student("0001", "±è¹ÎÁ¦", 1, 2, 3, 4);
		Student s2 = new Student("0002", "°­¹ÎÁ¦", 51, 63, 72, 8);
		Student s3 = new Student("0003", "ÀÌ¹ÎÁ¦", 12, 11, 53, 12);
		Student s4 = new Student("0004", "¹Ú¹ÎÁ¦", 13, 14, 15, 16);
		
		studentRepo.put(s1.getId(), s1);
		studentRepo.put(s2.getId(), s2);
		studentRepo.put(s3.getId(), s3);
		studentRepo.put(s4.getId(), s4);
	}
	
	public Student search(String id) {
//		Student s = studentRepo.get(id);
//		return s;
		return studentRepo.get(id);
	}
	
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		Student s = manager.search("0001");
		System.out.println("[" + s.getId() + "]" + s.getName() + "|" + s.getTotal());
		//example.search("0003");
	}
}
