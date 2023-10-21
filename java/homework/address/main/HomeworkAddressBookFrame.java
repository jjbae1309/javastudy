package homework.address.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class HomeworkAddressBookFrame extends JFrame {
	private HomeworkAddressBookPanel addressBookPanel = new HomeworkAddressBookPanel();
	
	public HomeworkAddressBookFrame() {
		initComponent();
		
	}
	
	private void initComponent() {
		this.setContentPane(addressBookPanel);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
