package dad02.swing01;

import javax.swing.JFrame;

public class TestFrame extends JFrame {
	// ���
	private TestPanel testPanel = new TestPanel();
	
	// ������
	public TestFrame() {
		initComponent();
	}
	
	// �޼ҵ�
	private void initComponent() {
		this.setContentPane(testPanel);
	}
}
