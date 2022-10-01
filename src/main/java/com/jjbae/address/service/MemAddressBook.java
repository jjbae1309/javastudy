package com.jjbae.address.service;

import java.util.ArrayList;
import java.util.List;

import com.jjbae.address.vo.AddressVo;

public class MemAddressBook implements AddressBookIf {
	private List<AddressVo> addressList = new ArrayList<>();
	
	@Override
	public List<AddressVo> select(AddressVo paramData) {
		// TODO Auto-generated method stub
		return addressList;
	}

	@Override
	public int insert(AddressVo paramData) {
		// TODO Auto-generated method stub
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
