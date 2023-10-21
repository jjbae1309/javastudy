package com.jjbae.app.lesson.address.service;

import java.util.List;

import com.jjbae.app.lesson.address.vo.AddressVo;

public interface AddressBookIf {
	/**
	 * 고유번호
	 * @return
	 */
	public int getNewSeqNum();
	
	/**
	 * 조회
	 * @param paramData
	 * @return
	 */
	public List<AddressVo> select(AddressVo paramData);
	
	/**
	 * 추가
	 * @param paramData
	 * @return
	 */
	public int insert(AddressVo paramData);
	
	/**
	 * 수정
	 * @param paramData
	 * @return
	 */
	public int update(AddressVo paramData);
	
	/**
	 * 삭제
	 * @param paramData
	 * @return
	 */
	public int delete(AddressVo paramData);
}
