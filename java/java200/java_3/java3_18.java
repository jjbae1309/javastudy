package java200.java_3;

import java.util.Scanner;

public class java3_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = scanner.nextInt();
		System.out.print("정수 b:"); int b = scanner.nextInt();
		
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		
		System.out.println("a > b 가 되도록 정렬하였습니다.");
		System.out.println("변수 a는 " +  a + "입니다.");
		System.out.println("변수 b는 " +  b + "입니다.");
	}
}
