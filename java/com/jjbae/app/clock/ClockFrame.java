package com.jjbae.app.clock;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClockFrame extends JFrame {
	public static final int FRAME_WIDTH = 400;
	public static final int FRAME_HEIGHT = 300;
	
	private ClockPanel clockPanel = new ClockPanel();
	
	public ClockFrame() {
		initComponent();
	}
	
	private void initComponent() {
		this.setContentPane(clockPanel);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setTitle("시계");
		
		// 종료 이벤트 처리
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 확인후 종료
				int result = JOptionPane.showConfirmDialog(ClockFrame.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
