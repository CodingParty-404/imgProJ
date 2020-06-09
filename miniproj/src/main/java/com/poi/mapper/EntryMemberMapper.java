package com.poi.mapper;

import java.util.List;

import com.poi.vo.meeting.EntryMemberVO;

public interface EntryMemberMapper {

	public int insert(EntryMemberVO vo);
	
	public List<EntryMemberVO> getList(Long number);
	
	public int update(EntryMemberVO vo);
	
	public int delete(Long mtno);
	
}
