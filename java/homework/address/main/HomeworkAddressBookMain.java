package homework.address.main;

import javax.swing.UIManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeworkAddressBookMain {
	private static Logger LOGGER = LoggerFactory.getLogger(HomeworkAddressBookMain.class);
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e) {
		}
		
		HomeworkAddressBookFrame frame = new HomeworkAddressBookFrame();
		frame.setTitle("주소록");
		frame.setSize(800, 600);
		frame.setVisible(true);	
	}
}
