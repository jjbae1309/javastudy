package com.jjbae.app.address_book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddressBookMain {
	private static Logger LOGGER = LoggerFactory.getLogger(AddressBookMain.class);
	
	public static void main(String[] args) {
		AddressBookFrame jFrame = new AddressBookFrame();
		jFrame.setSize(600, 400);
		jFrame.setVisible(true);
	}
}
