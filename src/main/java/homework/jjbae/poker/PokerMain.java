package homework.jjbae.poker;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokerMain {
	private static Logger LOGGER = LoggerFactory.getLogger(PokerMain.class);
	
	public static void main(String[] args) {
		try {
			CardInterface poker = new CardManager();
			
			Set<CardVo> player1Set = poker.getCards(5);
			Set<CardVo> player2Set = poker.getCards(5);
			
			LOGGER.debug("player1Set:" + player1Set.toString());
			LOGGER.debug("player2Set:" + player2Set.toString());

			PokerGrade player1Grade = poker.getGrade(player1Set);
			PokerGrade player2Grade = poker.getGrade(player2Set);
			
			int player1GradeOrd = -1;
			if (player1Grade != null) {
				player1GradeOrd = player1Grade.ordinal();
			}
			
			LOGGER.debug("player1GradeOrd:" + player1GradeOrd);
			
			int player2GradeOrd = -1;
			if (player2Grade != null) {
				player2GradeOrd = player2Grade.ordinal();
			}
			
			LOGGER.debug("player2GradeOrd:" + player2GradeOrd);
			
			if (player1GradeOrd == player2GradeOrd) {
				LOGGER.debug("비김");
			}
			else if (player1GradeOrd > player2GradeOrd) {
				LOGGER.debug("player1 승리");
			}
			else {
				LOGGER.debug("player2 승리");
			}
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
