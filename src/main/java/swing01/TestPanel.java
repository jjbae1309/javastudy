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
		
		// 색깔 변경
		g.setColor(Color.white);

		// 채운 사각형
		g.fillRect(0, 0, getWidth(), getHeight());
		
		// 그냥 사각형
		g.setColor(Color.blue);
		g.drawRect(100, 100, 100, 100);
		
		// 선
		g.setColor(new Color(35, 60, 152));
		g.drawLine(200, 200, 400, 100);
		
		// 원
		g.setColor(Color.cyan);
		g.drawOval(300, 100, 100, 100);
		
		// 다각형
		g.setColor(Color.yellow);
		int x[] = {100, 300, 500, 700, 1000};
		int y[] = {100, 300, 500, 700, 1000};
		g.drawPolygon(x, y, 5);
		
		// 문자열
		g.setColor(Color.red);
		g.drawString("배재준 천재", 100, 400);
		
	}
}
