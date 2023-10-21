package swing01;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame {
	private TestPanel jPanel_Main = new TestPanel();
	
	public TestFrame() {
		initComponent();
	}
	
	private void initComponent() {
		this.setContentPane(jPanel_Main);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���� ��ư ����");
				// �ڹ� ���μ��� ����
				System.exit(0);
			}
		});
	}
}
