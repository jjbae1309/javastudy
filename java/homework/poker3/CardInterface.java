package homework.poker3;

import java.util.Set;

public interface CardInterface {
	/**
	 * 카드를 다시 섞는다.
	 */
	public void clear();
	
	/**
	 * cardNum만큼 카드를 받는다.
	 * @param cardNum
	 * @return
	 * @throws Exception
	 */
	public Set<CardVo> getCards(int cardNum) throws Exception;
	
	/**
	 * cards를 넣고 PokerGrade 판정을 받는다.
	 * @param cards
	 * @return
	 */
	public PokerGrade getGrade(Set<CardVo> cards);
}
