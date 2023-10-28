package java200.java_4;

import java.util.Random;
import java.util.Scanner;

public class java4_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int no = 10 + rand.nextInt(90);
		System.out.println("숫자 맛추기 게임 시작");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		int x;
		do {
			System.out.print("어떤 숫자일까?");
			x = scanner.nextInt();
			
			if (x > no)
				System.out.println("더 작은 숫자입니다.");
			else if (x < no)
				System.out.println("더 큰 숫자입니다.");
		}
		while (x != no);
		System.out.println("정답입니다.");
	}
}
