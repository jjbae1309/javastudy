package study01.datastructure;

import java.util.*;

public class ClassVsWrapperClass {
	public static void main(String[] args) {
		
		int i = 100;
		//�⺻�� i�� j�� ��ȯ��Ų��
		Integer j = new Integer(i);	
		System.out.println(i + "\n" + j);

		double d = 37.5;
		//�⺻�� d �� l�� ��ȯ��Ų��
		Double l = new Double(d);
		System.out.println(d + "\n" + l);
		
		
		//Ŭ���� Integer�� ���� ��Ƽ� �⺻�� double�� ��ȯ��ų�� ������?
		/*
		Integer object = Integer.valueOf(23);
		double i = object;
		
		System.out.println(i);
		*/
		
	}
}
