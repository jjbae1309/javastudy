package dad02.swing02;

import javax.swing.JFrame;

public class SwingFrame extends JFrame {
	// 멤버
	private SwingPanel swingPanel = new SwingPanel();
	
	// 생성자
	public SwingFrame() {
		initComponent();
	}
	
	// 메소드
	private void initComponent() {
		this.setContentPane(swingPanel);
	}
}
