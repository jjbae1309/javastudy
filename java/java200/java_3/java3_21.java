package java200.java_3;

import java.util.Scanner;

public class java3_21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 월입니까?");
		int month = scanner.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5: System.out.println("봄"); break;
		case 6:
		case 7:
		case 8: System.out.println("여름"); 
		case 9:
			
		}
	}
}
