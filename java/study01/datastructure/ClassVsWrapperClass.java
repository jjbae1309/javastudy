package study01.datastructure;

import java.util.*;

public class ClassVsWrapperClass {
	public static void main(String[] args) {
		
		int i = 100;
		//기본형 i를 j로 전환시킨다
		Integer j = new Integer(i);	
		System.out.println(i + "\n" + j);

		double d = 37.5;
		//기본형 d 를 l로 전환시킨다
		Double l = new Double(d);
		System.out.println(d + "\n" + l);
		
		
		//클래스 Integer에 수를 담아서 기본형 double로 전환시킬수 있을까?
		/*
		Integer object = Integer.valueOf(23);
		double i = object;
		
		System.out.println(i);
		*/
		
	}
}
