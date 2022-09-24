package game.java.no2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Rocksizzerspaper {
	public static void main(String[] args) throws IOException {
		int comWin = 0;
		int humanWin = 0;
		
		for (int i = 0; i < 3; i++) {
			//0~2의 난수 발생
			Random r = new Random();
			int computer = Math.abs(r.nextInt() % 3); //난수를 구해서 3으로 나눈 나머지값
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			String user;
			System.out.println("가위, 바위, 보 중 하나를 선택하세요.(가위 = a 바위 = b 보 = c)");
			user = in.readLine();

			if (user.equals("a")) {
				if (computer == 0) 
					System.out.println("무승부!");
				else if (computer == 1) {
					System.out.println("컴퓨터 승리!");
					comWin ++;
				}
				else if(computer == 2) {
					System.out.println("사람 승리!");
					humanWin++;
				}
			}
			else if (user.equals("b")) {
				if(computer == 0) {
					System.out.println("사람 승리!");
					humanWin++;
				}
				if(computer == 1) System.out.println("무승부!");
				if(computer == 2) {
					System.out.println("컴퓨터 승리!");
					comWin++;
				}

			}
			else if (user.equals("c")) {
				if(computer == 0) {
					System.out.println("컴퓨터 승리!");
					comWin++;
				}
				if(computer == 1) {
					System.out.println("사람 승리!");
					humanWin++;
				}
				if(computer == 2) System.out.println("무승부!");

			}
		}
		
		if (comWin > humanWin) {
			System.out.println("컴퓨터가 사람에게 승리. 승리횟수:" + comWin);
		}
		else if (comWin < humanWin) {
			System.out.println("사람이 컴퓨터에게 승리. 승리횟수:" + humanWin);
		}
		else {
			System.out.println("비겼습니다.");
		}
	}
}
