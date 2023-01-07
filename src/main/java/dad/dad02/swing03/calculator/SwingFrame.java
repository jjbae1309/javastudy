package dad02.swing03.calculator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class SwingFrame extends JFrame {
	// ���
	private SwingPanel swingPanel = new SwingPanel();
	
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
