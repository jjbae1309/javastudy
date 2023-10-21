package study01.datastructure;

import java.lang.Integer;

public class CompareAbleExample {
	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer(20);
		//10이 20보다 작기에 0보다 작은 수가 출력된다
		System.out.println(a.compareTo(b));
		
		
		
		/*
		Integer c = new Integer(30);
		Double d = new Double(29.4);
		//타입이 같지 않을시 오류 발생
		System.out.println(c.compareTo(d));
		*/
		
		Double e = new Double(29.5);
		Double f = new Double(29.4);
		//29.5가 29.4보다 크기에 0보다 큰 수 출력
		System.out.println(e.compareTo(f));
	}
}
