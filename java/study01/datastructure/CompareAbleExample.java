package study01.datastructure;

import java.lang.Integer;

public class CompareAbleExample {
	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer(20);
		//10�� 20���� �۱⿡ 0���� ���� ���� ��µȴ�
		System.out.println(a.compareTo(b));
		
		
		
		/*
		Integer c = new Integer(30);
		Double d = new Double(29.4);
		//Ÿ���� ���� ������ ���� �߻�
		System.out.println(c.compareTo(d));
		*/
		
		Double e = new Double(29.5);
		Double f = new Double(29.4);
		//29.5�� 29.4���� ũ�⿡ 0���� ū �� ���
		System.out.println(e.compareTo(f));
	}
}
