package com.jjbae.address.service;

import java.util.List;

import com.jjbae.address.vo.AddressVo;

public interface AddressBookIf {
	public List<AddressVo> select(AddressVo paramData);
	public int insert(AddressVo paramData);
	public int update(AddressVo paramData);
	public int delete(AddressVo paramData);
}
