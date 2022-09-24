package game.java.no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TimesTable {
	public static void main(String[] args) throws IOException {
		
		int x, y;
		Random r = new Random();
			
		for (int i = 0; i < 4; i++) {
			if (args.length == 1) { //인수가 있으면 인수로 준 값으로 문제 출제
				//x = Integer.valueOf(args[0]).intValue();
				x = Integer.parseInt(args[0]);
				//인수는 STring 형이므로 랩퍼 클래스를 사용하여 int형으로 형변환
			} 
			else {
				x = Math.abs (r.nextInt() % 9) + 1;
			}
			
			y = Math.abs(r.nextInt() % 9) + 1;
			
			int num = x * y;
			
			System.out.println();
			System.out.println("* 구구단 " + x + "단에 대한 문제입니다.('x'는 종료)");
			System.out.println();
			
			System.out.println(x + " * " + y +" = ");
			
			BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
			String user;
			user = in.readLine();//키보드로부터 입력
			
			if ("x".equals(user)) {
				break;
			}
			
			//int inputNum = new Integer(user).intValue();
			int inputNum = Integer.parseInt(user);
			//키보드에서 입력받은 값은 String 형이므로 랩퍼클래스를 사용하여 int형으로 변환
			
			if (num == inputNum) {
				System.out.println("맞았습니다.");
			}
			else {
				System.out.println("틀렸습니다. 정답은 "+ num + " 입니다.");
			}
		}
		
		System.out.println("종료되었습니다.");
	}
}
