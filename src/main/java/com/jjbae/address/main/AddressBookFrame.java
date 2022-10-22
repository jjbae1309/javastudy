package com.jjbae.address.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class AddressBookFrame extends JFrame {
	private AddressBookPanel addressBookPanel = new AddressBookPanel();
	
	public AddressBookFrame() {
		initComponent();
	}
	
	private void initComponent() {
		this.setContentPane(addressBookPanel);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
