package jj01._enum;

public class OrderManager {
	public void order(Menu menu) throws Exception {
/*		
		if (Menu.AMERICANO.equals(menu)) {
			makeAmericano();
		}
		else if (Menu.LATTE.equals(menu)) {
			makeLatte();
		}
		else {
			throw new Exception("못 알아먹겠어!");
		}
*/
		switch (menu) {
		case AMERICANO:
			makeAmericano();
			break;
		case LATTE:
			makeLatte();
			break;
		case TEA:
			makeTea();
			break;
		case JUICE:
			makeJuice();
			break;
				
		}
	}
	
	private void makeAmericano() {
		System.out.println("아메리카노 만듦");
	}
	
	private void makeLatte() {
		System.out.println("라떼를 만듦");
	}
	
	private void makeTea() {
		System.out.println("티를 만듦");
	}
	
	private void makeJuice() {
		System.out.println("쥬스를 만듦");
	}
}
