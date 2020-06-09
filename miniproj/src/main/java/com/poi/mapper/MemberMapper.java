package com.poi.mapper;

import java.util.List;
import java.util.Map;

import com.poi.vo.member.MemberVO;

public interface MemberMapper extends CRUDMapper<MemberVO, Long> {

	public List<MemberVO> getList();
	
	
	public List<Map<String, String>> getMemberListAllData();
	
	
}
