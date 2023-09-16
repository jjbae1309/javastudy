package com.jjbae.app.address_book;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

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
		
		this.setContentPane(addressBookPanel);
		
		// 종료 이벤트 처리
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
