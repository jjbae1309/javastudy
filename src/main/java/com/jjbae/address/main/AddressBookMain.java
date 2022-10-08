package com.jjbae.address.main;

import java.util.List;

import com.jjbae.address.service.MemAddressBook;
import com.jjbae.address.vo.AddressVo;

public class AddressBookMain {
	public static void main(String[] args) {
		MemAddressBook addressBook = new MemAddressBook();
		
		AddressVo address1 = new AddressVo();
		address1.setAddress("경기도");
		address1.setBirth("2009-09-04");
		address1.setName("수원");
		address1.setPhoneNum("010-xxxx-xxxx");
		
		addressBook.insert(address1);
		
		List<AddressVo> addressList = addressBook.select(new AddressVo());
		for (int i = 0; i < addressList.size(); i++) {
			System.out.println(addressList.get(i));
		}
	}
}
