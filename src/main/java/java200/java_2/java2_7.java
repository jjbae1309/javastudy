package java200.java_2;

import java.util.Scanner;

public class java2_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정숫값:");
		int x = scanner.nextInt();
		
		System.out.println("마지막 자릿수를 제외한 값은 " + (x / 10) + "입니다");
		System.out.println("마지막 자릿수는 " + (x % 10) + "입니다.");
	}
}
