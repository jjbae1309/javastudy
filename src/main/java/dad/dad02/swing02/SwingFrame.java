package dad02.swing02;

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
	}
}
