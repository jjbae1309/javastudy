package homework.homeworkPoker;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import homework.jjbae.poker.CardInterface;
import homework.jjbae.poker.CardManager;
import homework.jjbae.poker.CardVo;
import homework.jjbae.poker.PokerGrade;

public class PokerMain {
	private static Logger LOGGER = LoggerFactory.getLogger(PokerMain.class);
	
	public static final int CARD_NUM = 7;
	public static final int GAME_NUM = 10000;
	
	public static void main(String[] args) {
		try {
			CardInterface poker = new CardManager();
			
			int player1Win = 0;
			int player2Win = 0;

			Map<PokerGrade, Integer> gradeMap = new HashMap<>();
			
			for (int i = 0; i < GAME_NUM; i++) {
				poker.clear();
				
				Set<CardVo> player1Set = poker.getCards(CARD_NUM);
				Set<CardVo> player2Set = poker.getCards(CARD_NUM);
				
				LOGGER.debug("player1Set:" + player1Set.toString());
				LOGGER.debug("player2Set:" + player2Set.toString());
	
				PokerGrade player1Grade = poker.getGrade(player1Set);
				PokerGrade player2Grade = poker.getGrade(player2Set);
				
				// PokerGrade별 count를 구한다.(통계)
				Integer gradeCount = gradeMap.get(player1Grade);
				if (gradeCount == null)
					gradeCount = 0;
				
				gradeMap.put(player1Grade, gradeCount + 1);
				
				gradeCount = gradeMap.get(player2Grade);
				if (gradeCount == null)
					gradeCount = 0;

				gradeMap.put(player2Grade, gradeCount + 1);
				
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
					player1Win++;
				}
				else {
					LOGGER.debug("player2 승리");
					player2Win++;
				}	
			}
			
			LOGGER.info("player1 승리횟수: " + player1Win);
			LOGGER.info("player2 승리횟수: " + player2Win);

			Set<PokerGrade> gradeSet = gradeMap.keySet();
			Iterator<PokerGrade> gradeIter = gradeSet.iterator();
			while (gradeIter.hasNext()) {
				PokerGrade oneGrade = gradeIter.next();
				int count = gradeMap.get(oneGrade);
				
				LOGGER.info(String.format("[%s]:%s", oneGrade, count));
			}
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
	}
}
