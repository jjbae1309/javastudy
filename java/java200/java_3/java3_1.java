package java200.java_3;

import java.util.Scanner;

public class java3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값");
		int n = scanner.nextInt();
		
		if (n < 0) {
			System.out.println("이 값은 음의 값입니다.");
		}
	}
}
