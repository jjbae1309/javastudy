package homework.homeworkPoker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import homework.homeworkPoker.*;

public class CardManager implements CardInterface {
	private static Logger LOGGER = LoggerFactory.getLogger(CardManager.class);
	
	private final int SYMBOL_NUM = Symbol.values().length;
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
	@Override
	public PokerGrade getGrade(Set<CardVo> cards) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> numMap = new HashMap<>();
		
		Iterator<CardVo> iter = cards.iterator();
		while (iter.hasNext()) {
			// CardVo를 하나씩 조회한다.
			CardVo cardVo = iter.next();
			
			// CardVo의 숫자를 확인한다.
			int cardNum = cardVo.getNum();
			// 이전에 들어가 있는 값을 확인한다.
			Integer prevValue = numMap.get(cardNum);
			
			if (prevValue == null) {
				prevValue = 0;
			}
			
			// 숫자를 담는 map에 해당 숫자를 key로 횟수를 담는다.
			numMap.put(cardNum, prevValue + 1);
		}	
			
		int onePairCount = 0;
		int tripleCount = 0;
			
		Set<Integer> cardKeySet = numMap.keySet();
		Iterator<Integer> keyIter = cardKeySet.iterator();
		while (keyIter.hasNext()) {
			Integer oneKey = keyIter.next();
			LOGGER.debug(String.format("[%s]:%s", oneKey, numMap.get(oneKey)));
				
			int count = numMap.get(oneKey);
				
			if (count == 3) {
					tripleCount++;
			}
			else if (count == 2) {
				onePairCount++;
			}
		}
		
		
		PokerGrade returnValue = null;
		
		if (onePairCount == 1 && tripleCount == 1) {
			returnValue = PokerGrade.FULL_HOUSE;
		}
		else if (tripleCount == 1) {
			returnValue = PokerGrade.TRIPLE;
		}
		else if (onePairCount == 2) {
			returnValue = PokerGrade.TWO_PAIR;
		}
		else if (onePairCount == 1) {
			returnValue = PokerGrade.ONE_PAIR;
		}

		LOGGER.debug("returnValue:" + returnValue);
		
		return returnValue;
	}
}
