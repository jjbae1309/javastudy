package java200.java_2;

import java.util.Scanner;

public class java2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정숫값");
		int x = scanner.nextInt();
		
		System.out.println("10을 더한 값은 " + (x + 10) + "입니다.");
		System.out.println("10을 뻰 값은 " + (x - 10) + "입니다.");
	}
}
