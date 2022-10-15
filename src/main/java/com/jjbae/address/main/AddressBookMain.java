package com.jjbae.address.main;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjbae.address.service.MemAddressBook;
import com.jjbae.address.vo.AddressVo;

public class AddressBookMain {
	private static Logger LOGGER = LoggerFactory.getLogger(AddressBookMain.class);
	
	
	
	public static void main(String[] args) {
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
	}
}
