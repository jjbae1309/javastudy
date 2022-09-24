package dad01.datastructure02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBookExample {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setAddress("��⵵ ������");
		p1.setName("������");
		p1.setAge(14);
		p1.setGender("��");
		p1.setPhone("01087953817");
		
		list.add(p1);
		
		Person p1_1 = new Person("������", 14, "��", "��⵵ ������", "01087953817");
		
		Person p2 = new Person();
		p2.setAddress("��⵵ ������");
		p2.setName("������");
		p2.setAge(14);
		p2.setGender("��");
		p2.setPhone("01012345678");
		
		list.add(p2);
		
		Person p3 = new Person();
		p3.setAddress("��⵵ ������");
		p3.setName("�����");
		p3.setAge(9);
		p3.setGender("��");
		p3.setPhone("01090473817");
		
		list.add(p3);
		
		for (Person i : list) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		Collections.sort(list);
		
		for (Person i : list) {
			System.out.println(i);
		}
	}
}
