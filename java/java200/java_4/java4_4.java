package java200.java_4;

import java.util.Scanner;

public class java4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 A:");
		int a = scanner.nextInt();
		System.out.print("정수 B:");
		int b = scanner.nextInt();
		
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		do {
			System.out.print(a + " ");
			a = a + 1;
		}
		while (a <= b);
		System.out.println();
	}
}
