package com.jjbae.app.text;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.jjbae.app.address_book.AddressBookFrame;

public class TextFrame extends JFrame {
	
	private TextPanel textPanel = new TextPanel();

	public TextFrame() {
		init();
	}
	
	private void init() {
		this.setTitle("채팅");
		this.setContentPane(textPanel);
		
		// 종료 이벤트 처리
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 확인후 종료
				int result = JOptionPane.showConfirmDialog(TextFrame.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
