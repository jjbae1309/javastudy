package homework.jjbae.poker;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokerMain {
	private static Logger LOGGER = LoggerFactory.getLogger(PokerMain.class);
	
	public static void main(String[] args) {
		try {
			CardInterface poker = new CardManager();
			
			Set<CardVo> userSet = poker.getCards(10);
			Set<CardVo> pokerSet = poker.getCards(10);
			
			LOGGER.debug("userSet:" + userSet.toString());
			LOGGER.debug("pokerSet:" + pokerSet.toString());
			
			LOGGER.debug("pokerSet:" + poker.getCards(10).toString());
			LOGGER.debug("pokerSet:" + poker.getCards(10).toString());
			LOGGER.debug("pokerSet:" + poker.getCards(10).toString());
			
			poker.clear();
			LOGGER.debug("pokerSet:" + poker.getCards(10).toString());
/*		
		int correctNum = 0;
		
		Iterator<CardVo> userIter = userSet.iterator();
		while (userIter.hasNext()) {
			CardVo userCard = userIter.next();
			
			Iterator<CardVo> pokerIter = pokerSet.iterator();
			while(pokerIter.hasNext()) {
				CardVo comCard = pokerIter.next();
				
			}
		}
		
		LOGGER.debug("correctNum:" + correctNum);
		
		switch (correctNum) {
		case 2:
			System.out.println("원페어입니다.");
			break;
		case 3:
			System.out.println("트리플입니다.");
			break;
		case 4:
			System.out.println("포카입니다.");
			break;
		default:
			System.out.println("아무 패도 아닙니다.");
		}
*/		
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
	}
}
