package homework.jjbae.rps;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RpsMain {
	private static Logger LOGGER = LoggerFactory.getLogger(RpsMain.class);
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RpsInterface rps = new RpsImpl();
		
		while (true) {
			System.out.println("1(바위), 2(보), 3(가위)중 하나를 입력하세요.(0은 종료)");

			int userInput = scanner.nextInt();

			if (userInput == 0) {
				break;
			}

			int rpsInput = rps.getRps();
			System.out.println("rpsInput:" + rpsInput);			

			if (rpsInput == userInput) {
				System.out.println("비겼습니다");
			}
			else if ((rpsInput == 1 && userInput == 2) ||
					(rpsInput == 2 && userInput == 3) ||
					(rpsInput == 3 && userInput == 1)) {
				System.out.println("유저 승리");
			}
			else
				System.out.println("유저 패배");
		}
	}
}
