package dad01.datastructure03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRankExample {
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		
		Student s1 = new Student("0001", "±è¹ÎÁ¦", 1, 2, 3, 4);
		Student s2 = new Student("0002", "°­¹ÎÁ¦", 51, 63, 72, 8);
		Student s3 = new Student("0003", "ÀÌ¹ÎÁ¦", 12, 11, 53, 12);
		Student s4 = new Student("0004", "¹Ú¹ÎÁ¦", 13, 14, 15, 16);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);

		for (Student s : studentList) {
			System.out.println(s);
		}
		
		Collections.sort(studentList, Collections.reverseOrder());
		
		System.out.println("-------------- ¼øÀ§ »êÁ¤ ÈÄ ----------------");
		
		for (Student s : studentList) {
			System.out.println(s);
		}		
	}
}
