package homework.jjbae.poker;

public class CardVo {
	private int num;
	private Symbol symbol;
	
	public CardVo(int num, Symbol symbol) {
		this.num = num;
		this.symbol = symbol;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public Symbol getSymbol() {
		return symbol;
	}
	
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof CardVo) {
			CardVo anotherCard = (CardVo)o;
			
			if (this.num == anotherCard.getNum() &&
					this.symbol == anotherCard.getSymbol()) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return num + symbol.hashCode();
	}
	
	@Override
	public String toString() {
		String cardString = null;
		
		switch (symbol) {
		case CLOVER: 
			cardString = "♣";
			break;
		case HEART:
			cardString = "♥";
			break;
		case DIAMOND:
			cardString = "◆";
			break;
		case SPADE:
			cardString = "♠";
			break;
		}
		
		switch (num) {
		case 1:
			cardString = cardString + "A";
			break;
		case 11:
			cardString = cardString + "J";
			break;
		case 12:
			cardString += "Q";
			break;
		case 13:
			cardString += "K";
			break;
		default:
			cardString += num;
		}
		
		return cardString;
	}
}
