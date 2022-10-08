package com.jjbae.address.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjbae.address.vo.AddressVo;

public class MemAddressBook implements AddressBookIf {
	private static Logger LOGGER = LoggerFactory.getLogger(MemAddressBook.class);
	
	private List<AddressVo> addressList = new ArrayList<>();
	
	@Override
	public List<AddressVo> select(AddressVo paramData) {
		// TODO Auto-generated method stub
		return addressList;
	}

	@Override
	public int insert(AddressVo paramData) {
		// TODO Auto-generated method stub
		LOGGER.info("paramData:" + paramData);
		
		addressList.add(paramData);
		return 1;
	}

	@Override
	public int update(AddressVo paramData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(AddressVo paramData) {
		// TODO Auto-generated method stub
		return 0;
	}
}
