package dad02.swing04.form;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class SwingFrame extends JFrame {
	// ���
	private AddressBookPanel swingPanel = new AddressBookPanel();
	
	// ������
	public SwingFrame() {
		initComponent();
	}
	
	// �޼ҵ�
	private void initComponent() {
		this.setContentPane(swingPanel);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
