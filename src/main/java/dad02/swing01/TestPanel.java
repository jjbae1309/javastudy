package dad02.swing01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TestPanel extends JPanel {
	// 멤버 필드
	private ImageIcon character = new ImageIcon("C:\\Users\\budic\\eclipse-workspace\\Study\\resources\\image\\mc.png");
	
	private int xPos = 100;
	private int yPos = 100;
	
	// 생성자
	public TestPanel() {
		initComponent();
	}
	
	private void initComponent() {
		this.setFocusable(true);
		this.requestFocus(); 
		
		this.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				System.out.println("keyReleased");
				
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					xPos -= 100;
					repaint();
				}
				else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					xPos += 100;
					repaint();
				}
				else if (e.getKeyCode() == KeyEvent.VK_UP) {
					yPos -= 100;
					repaint();
				}
				else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					yPos += 100;
					repaint();
				}
			}
		});
	}
	
	// 메소드
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//g.setColor(Color.black);
		//g.drawString("재준아 머리 아프지?", 100, 100);
		
		g.drawImage(character.getImage(), xPos, yPos, this);
	}
}
