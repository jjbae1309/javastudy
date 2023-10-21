package study01.datastructureHomework.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapTest {
	private static Logger LOGGER = LoggerFactory.getLogger(MapTest.class);
	
	private static Map<Symbol, List<CardVo>> map = new HashMap<>();

	public static void addCard(Symbol symbol, CardVo cardVo) {
		if (map.containsKey(symbol) == false) 
			map.put(symbol, new ArrayList<CardVo>());
		
		map.get(symbol).add(cardVo);
	}
	
	public static void main(String[] args) {
		Set<Symbol> symbolSet = new HashSet<>();
		// symbolSet에 4개의 Symbol을 추가하고
		symbolSet.add(Symbol.SPADE); 
		symbolSet.add(Symbol.CLOVER);
		symbolSet.add(Symbol.DIAMOND);
		symbolSet.add(Symbol.HEART);
		// symbolSet의 내용을 출력한다.
		Iterator<Symbol> iter = symbolSet.iterator();
		while (iter.hasNext()) {
			Symbol oneValue = iter.next();
//			LOGGER.debug(String.format("%s", oneValue));
			LOGGER.debug(oneValue.toString());
		}

		/*
		Map<Symbol, CardVo> map = new HashMap<>();
		// map에 SPADE A(1)를 만들고 Key를 SPADE로 해서 넣는다.
//		CardVo card = new CardVo(1, Symbol.SPADE);
//		map.put(Symbol.SPADE, card);
		map.put(Symbol.SPADE, new CardVo(1, Symbol.SPADE));
		
		// map에 SPADE K(13)를 만들고 Key를 SPADE로 해서 넣는다.
		map.put(Symbol.SPADE, new CardVo(13, Symbol.SPADE));
		
		// map에 HEART A(1)를 만들고 Key를 HEART로 해서 넣는다.
		map.put(Symbol.HEART, new CardVo(1, Symbol.HEART));
		
		// map에 CLOVER A(1)를 만들고 Key를 CLOVER로 해서 넣는다.
		map.put(Symbol.CLOVER, new CardVo(1, Symbol.CLOVER));
		
		// map에 DIAMOND A(1)를 만들고 Key를 DIAMOND로 해서 넣는다.
		map.put(Symbol.DIAMOND, new CardVo(1, Symbol.DIAMOND));
		
		// map에 DIAMOND 2를 만들고 Key를 DIAMOND로 해서 넣는다.
		map.put(Symbol.DIAMOND, new CardVo(2, Symbol.DIAMOND));
		
		// map의 내용을 출력한다.
//		Set<Symbol> keySet = map.keySet();
//		Iterator<Symbol> keyIter = keySet.iterator();
//		Iterator<Symbol> keyIter = map.keySet().iterator();
//		
//		while (keyIter.hasNext()) {
//			Symbol oneKey = keyIter.next();
//			CardVo oneValue = map.get(oneKey);
//			LOGGER.debug(String.format("[%s]%s", oneKey, oneValue));
//		}
		
//		for (Symbol oneKey : map.keySet()) {
//			CardVo oneValue = map.get(oneKey);
//			LOGGER.debug(String.format("Key:%s / Value:%s", oneKey, oneValue));
//		}
		*/
		
//		if (map.containsKey(Symbol.SPADE) == false) 
//			map.put(Symbol.SPADE, new ArrayList<CardVo>());
//		
//		map.get(Symbol.SPADE).add(new CardVo(1, Symbol.SPADE));
		
		addCard(Symbol.SPADE, new CardVo(1, Symbol.SPADE));
		addCard(Symbol.SPADE, new CardVo(13, Symbol.SPADE));
		addCard(Symbol.HEART, new CardVo(1, Symbol.HEART));
		addCard(Symbol.DIAMOND, new CardVo(1, Symbol.DIAMOND));
		addCard(Symbol.DIAMOND, new CardVo(2, Symbol.DIAMOND));
		addCard(Symbol.CLOVER, new CardVo(1, Symbol.CLOVER));
		
		for (Symbol oneKey : map.keySet()) {
			List<CardVo> cardList = map.get(oneKey);
			LOGGER.debug(String.format("[%s]:%s", oneKey, cardList));
		}
	}
}
