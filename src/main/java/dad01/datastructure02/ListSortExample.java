package dad01.datastructure02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortExample {
	public static void main(String[] args) {
		/*
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
		*/
		
		/*
		List<String> list = new ArrayList<>();
		list.add("배재준");
		list.add("배재율");
		list.add("배수현");
		
		for (String s : list) {
			System.out.println(s);
		
		}
		
		System.out.println("------------------------------------");
		
		Collections.sort(list);
		
		for (String s : list) {
			System.out.println(s);
		}
		
		*/
		
		List<Float> list = new ArrayList<>();
		list.add((float)4/9);
		list.add((float)5/11);
		list.add((float)-4/9);
		list.add((float)-5/11);		
		
		for (float f : list) {
			System.out.println(f);
		}
		
		System.out.println("------------------------------------");
		
		Collections.sort(list);
		
		for (float f : list) {
			System.out.println(f);
		}
		
		System.out.println("integer 최대값:" + Integer.MAX_VALUE);
		System.out.println("integer 최소값:" + Integer.MIN_VALUE);
		
		String a = "1234";
		String b = "5678";
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		int cc = aa + bb;
		
		String c = Integer.toString(cc);
		
		System.out.println(cc);
		
		System.out.println(c + "(" + c.getClass().getName() + ")");
	}
}
