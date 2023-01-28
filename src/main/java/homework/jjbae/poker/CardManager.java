package homework.jjbae.poker;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CardManager implements CardInterface {
	private static Logger LOGGER = LoggerFactory.getLogger(CardManager.class);
	
	private final int SYMBOL_NUM = Symbol.values().length;	// 4
	private final int CARD_NUM = 13;
	
	// 이미 제공한 카드
	private Set<CardVo> servedCards = new HashSet<>();
	
	@Override
	public void clear() {
		servedCards.clear();
	}
	
	@Override
	public Set<CardVo> getCards(int cardNum) throws Exception {
		// 제공할 카드
		Set<CardVo> servingCards = new HashSet<>();
		while (servingCards.size() < cardNum) {
			if (servedCards.size() >= SYMBOL_NUM * CARD_NUM) {
				throw new Exception("더 이상 제공할 카드가 없습니다.");
			}
			
			int symbolNum = (int)(Math.random() * SYMBOL_NUM) + 1;
			
			Symbol symbol = null;
			switch (symbolNum) {
			case 1:
				symbol = Symbol.CLOVER;
				break;
			case 2:
				symbol = Symbol.HEART;
				break;
			case 3:
				symbol = Symbol.DIAMOND;
				break;
			case 4:
				symbol = Symbol.SPADE;
				break;
			}
			
			int num = (int)(Math.random() * CARD_NUM) + 1;
			//LOGGER.debug("num:" + num);
			
			CardVo cardVo = new CardVo(num, symbol);
			
			// 이미 제공된 카드인가?
			if (servedCards.contains(cardVo)) {
				continue;
			}
			
			servedCards.add(cardVo);
			servingCards.add(cardVo);
		}
		
		return servingCards;
	}
}
