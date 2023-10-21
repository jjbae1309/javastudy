package dad02.swing01;

import javax.swing.ImageIcon;

public class SwingExample {
	public static void main(String[] args) {
		TestFrame frame = new TestFrame();
		
		ImageIcon icon = new ImageIcon("C:\\Users\\budic\\eclipse-workspace\\Study\\resources\\image\\jj.png");
		
		frame.setIconImage(icon.getImage());
		frame.setTitle("재준이의 마인크래프트");
		frame.setSize(600, 400);
		frame.setVisible(true);
	}
}
