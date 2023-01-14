package homework.jjbae.lottery;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LotteryMain {
	private static Logger LOGGER = LoggerFactory.getLogger(LotteryMain.class);
	
	public static void main(String[] args) {
		// 사용자로부터 숫자 6개를 입력 받는다.
		Set<Integer> userSet = new HashSet<>();
		
		while (userSet.size() < 6) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요.");
			int num = scanner.nextInt();
			
			userSet.add(num);
		}
		
		LOGGER.debug(userSet.toString());
		
		// 로또 기계를 돌려 6개의 숫자를 만든다.
		LotteryInterface lottery = new LotteryImpl();
		Set<Integer> lotterySet = lottery.generateNum();
		LOGGER.debug(lotterySet.toString());
		
		// 비교해서, 3개가 맞으면 4등
		// 4개가 맞으면 3등
		// 5개가 맞으면 2등
		// 6개가 맞으면 1등
		// 그외에는 꽝
		int correctNum = 0;
		
		Iterator<Integer> userIter = userSet.iterator();
		while (userIter.hasNext()) {
			int userNum = userIter.next();
			
			Iterator<Integer> lotIter = lotterySet.iterator();
			while (lotIter.hasNext()) {
				int lotNum = lotIter.next();
				
				if (userNum == lotNum) {
					correctNum++;
					//correctNum = correctNum + 1;
					break;
				}
			}
		}
		
		LOGGER.debug("correctNum:" + correctNum);
		
		switch (correctNum) {
		case 3:
			System.out.println("4등 당첨");
			break;
		case 4:
			System.out.println("3등 당첨");
			break;
		case 5:
			System.out.println("2등 당첨");
			break;
		case 6:
			System.out.println("1등 당첨");
			break;
		default:
			System.out.println("꽝");	
		}
	}
}
