package game.java.chap04;

public class ArithmeticTest {
	public static void main(String[] args) {
		
		int num = 256;
		
		System.out.println("주어진 수 : "+ num);
		System.out.println(" 1의 자리:"+ num % 10);     // 나머지 출력
		num = num / 10; // num의 값 변경
		System.out.println("10의 자리:"+ num % 10);
		num = num / 10;
		System.out.println("100의 자리:" + num % 10);
	}
}
