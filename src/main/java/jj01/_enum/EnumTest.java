package jj01._enum;

public class EnumTest {
	public static void main(String[] args) {
		try {
			OrderManager manager = new OrderManager();
			manager.order(Menu.JUICE);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
