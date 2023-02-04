package homework.poker;

import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import homework.jjbae.poker.CardInterface;
import homework.jjbae.poker.CardManager;
import homework.jjbae.poker.CardVo;

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
			
		
			
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
	}
}
