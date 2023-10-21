package swingHomework;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Star extends JPanel {
	public Star() {
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		
		g.drawLine(100, 100, 50, 200);
		g.drawLine(50, 200, 150, 150);
		g.drawLine(150, 150, 75, 150);
		//int x[] = {36, 72, 108, 144, 180};
		//int y[] = {216, 252, 288, 324, 360};
		//g.drawPolygon(x, y, 5);

	}
}