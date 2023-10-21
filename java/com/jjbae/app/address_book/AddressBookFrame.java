package com.jjbae.app.address_book;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddressBookFrame extends JFrame {
	// 필드
	private AddressBookPanel addressBookPanel = new AddressBookPanel();
	
	
	// 생성자
	public AddressBookFrame() {
		init();
	}

	// 메소드
	private void init() {
		this.setTitle("주소록");
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setContentPane(addressBookPanel);
		
		// 종료 이벤트 처리
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 확인후 종료
				int result = JOptionPane.showConfirmDialog(AddressBookFrame.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
