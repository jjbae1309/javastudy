package study01.datastructureHomework.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import study01.datastructureHomework.test.CardVo;
import study01.datastructureHomework.test.Symbol;

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
		symbolSet.add(Symbol.SPADE);
		symbolSet.add(Symbol.CLOVER);
		symbolSet.add(Symbol.DIAMOND);
		symbolSet.add(Symbol.HEART);
			
		Iterator<Symbol> iter = symbolSet.iterator();
		while (iter.hasNext()) {
			Symbol oneValue = iter.next();
			LOGGER.debug(oneValue.toString());
		}
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
