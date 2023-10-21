package homework.jjbae.poker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
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

	@Override
	public PokerGrade getGrade(Set<CardVo> cards) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> numMap = new HashMap<>();
		Map<Symbol, Integer> symbolMap = new HashMap<>();
		
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
			
			// CardVo의 모양을 확인한다.
			Symbol cardSymbol = cardVo.getSymbol(); 
			
			// 이전에 들어가 있는 값을 확인한다.
			Integer prevSymbolValue = symbolMap.get(cardSymbol);
			if (prevSymbolValue == null) {
				prevSymbolValue = 0;
			}
			
			// 모양을 담는 map에 해당 모양을 key로 횟수를 담는다.
			symbolMap.put(cardSymbol, prevSymbolValue + 1);
		}
		int flushCount = 0;
		
		int onePairCount = 0;
		int tripleCount = 0;
		int pokerCount = 0;
		
		Set<Integer> cardKeySet = numMap.keySet();
		Iterator<Integer> keyIter = cardKeySet.iterator();
		while (keyIter.hasNext()) {
			Integer oneKey = keyIter.next();
			LOGGER.debug(String.format("[%s]:%s", oneKey, numMap.get(oneKey)));
			
			int count = numMap.get(oneKey);
			
			if (count == 4) {
				pokerCount++;
			}
			else if (count == 3) {
				tripleCount++;
			}
			else if (count == 2) {
				onePairCount++;
			}
		}
		
		// 모양을 담는 map에서 모양별로 count를 확인한다.	
		Set<Symbol> symbolKeySet = symbolMap.keySet();
		Iterator<Symbol> symbolKeyIter = symbolKeySet.iterator();
		while (symbolKeyIter.hasNext()) {
			Symbol symbolKey = symbolKeyIter.next();
			
			int symbolCount = symbolMap.get(symbolKey);
			
			// 모양의 count가 5이상이 나오면 flush
			if (symbolCount == 5) {
				flushCount++;
			}
		}
		
		PokerGrade returnValue = null;
		if (pokerCount == 1) {
			returnValue = PokerGrade.POKER;
		}
		else if (onePairCount == 1 && tripleCount == 1) {
			returnValue = PokerGrade.FULL_HOUSE;
		}
		else if (flushCount == 1) {
			returnValue = PokerGrade.FLUSH;
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
