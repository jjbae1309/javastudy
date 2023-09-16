package java200.java_2;

import java.util.Scanner;

public class java2_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성:"); String lastName = scanner.next();
		System.out.print("이름:"); String firstName = scanner.next();
		System.out.println("안녕하세요. " + lastName + firstName + "씨.");
	}
}
