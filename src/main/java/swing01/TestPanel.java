package swing01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TestPanel extends JPanel {
	public TestPanel() {
	}
	
	@Override
	public void paintComponent(Graphics g) {
		System.out.println("paintComponent");
		
		// ���� ����
		g.setColor(Color.white);

		// ä�� �簢��
		g.fillRect(0, 0, getWidth(), getHeight());
		
		// �׳� �簢��
		g.setColor(Color.blue);
		g.drawRect(100, 100, 100, 100);
		
		// ��
		g.setColor(new Color(35, 60, 152));
		g.drawLine(200, 200, 400, 100);
		
		// ��
		g.setColor(Color.cyan);
		g.drawOval(300, 100, 100, 100);
		
		// �ٰ���
		g.setColor(Color.yellow);
		int x[] = {100, 300, 500, 700, 1000};
		int y[] = {100, 300, 500, 700, 1000};
		g.drawPolygon(x, y, 5);
		
		// ���ڿ�
		g.setColor(Color.red);
		g.drawString("������ õ��", 100, 400);
		
	}
}
