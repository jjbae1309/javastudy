package java200.java_4;

import java.util.Scanner;

public class java4_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		
		do {
			System.out.print("세 자리의 정숫값.");
			x = scanner.nextInt();
		}
		while (x < 100 || x > 999);
		
		System.out.print("입력한 값은 " + x + "입니다.");
	}
}
