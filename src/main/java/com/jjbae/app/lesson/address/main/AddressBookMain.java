package com.jjbae.app.lesson.address.main;

import javax.swing.UIManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddressBookMain {
	private static Logger LOGGER = LoggerFactory.getLogger(AddressBookMain.class);
	
	public static void main(String[] args) {
		/*
		MemAddressBook addressBook = new MemAddressBook();
		
		AddressVo address1 = new AddressVo();
		address1.setSeqNum(addressBook.getNewSeqNum());
		address1.setAddress("경기도");
		address1.setBirth("2009-09-04");
		address1.setName("배재준");
		address1.setPhoneNum("010-xxxx-xxxx");
		
		addressBook.insert(address1);
		
		AddressVo address2 = new AddressVo();
		address2.setSeqNum(addressBook.getNewSeqNum());
		address2.setAddress("경기도");
		address2.setBirth("2012-06-01");
		address2.setName("배재율");
		address2.setPhoneNum("010-yyyy-yyyy");
		
		addressBook.insert(address2);
		
		addressBook.debugData();
		
		AddressVo address3 = new AddressVo();
		address3.setSeqNum(1);
		address3.setAddress("서울");
		address3.setBirth("2009-09-04");
		address3.setName("배재준");
		address3.setPhoneNum("010-xxxx-xxxx");
		
		addressBook.update(address3);
		
		LOGGER.debug("수정 완료");
		
		addressBook.debugData();
		
		AddressVo deleteParam = new AddressVo();
		deleteParam.setSeqNum(2);
		
		addressBook.delete(deleteParam);
		
		LOGGER.debug("삭제 완료");
		
		addressBook.debugData();
		*/
		try {
			 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		 }
		 catch (Exception e) { }
		
		AddressBookFrame frame = new AddressBookFrame();
		frame.setTitle("주소록");
		frame.setSize(800, 600);
		frame.setVisible(true);
		
	}
}
