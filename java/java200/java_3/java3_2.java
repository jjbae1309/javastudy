package java200.java_3;

import java.util.Scanner;

public class java3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("정숫값");
//		int n = scanner.nextInt();
//		
//		if (n >= 0) {
//			System.out.println("절댓값은 "+ n + " 입니다.");
//		}
//		else {
//			System.out.println("절댓값은 " + -n + " 입니다.");
//		}
		
		System.out.print("정숫값:");
		int n = scanner.nextInt();
		int abs;
		
		if ( n >= 0) {
			abs = n;
		}
		else {
			abs = -n;
		}
		System.out.println("절댓값은 " + abs + "입니다.");
	}
}
