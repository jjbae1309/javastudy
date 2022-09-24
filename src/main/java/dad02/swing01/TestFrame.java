package dad02.swing01;

import javax.swing.JFrame;

public class TestFrame extends JFrame {
	// 멤버
	private TestPanel testPanel = new TestPanel();
	
	// 생성자
	public TestFrame() {
		initComponent();
	}
	
	// 메소드
	private void initComponent() {
		this.setContentPane(testPanel);
	}
}
