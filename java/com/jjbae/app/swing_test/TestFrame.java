package com.jjbae.app.swing_test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFrame extends JFrame {
//	private TestPanel testPanel = new TestPanel();
//	private TestPanel2 testPanel = new TestPanel2();
	private NaverPanel testPanel = new NaverPanel();
	
	public TestFrame() {
		//this.initComponent();
		initComponent();
	}
	
	private void initComponent() {
		this.setTitle("집중력 테스트");
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setContentPane(testPanel);
		
		// 닫기 버튼 누를시 프로그램 종료
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// 확인후 종료
				int result = JOptionPane.showConfirmDialog(TestFrame.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
