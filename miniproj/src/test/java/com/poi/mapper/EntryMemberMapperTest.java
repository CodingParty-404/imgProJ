package com.poi.mapper;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.testparent.TestParent;
import com.poi.vo.meeting.EntryMemberVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class EntryMemberMapperTest extends TestParent{

	@Autowired
	private EntryMemberMapper entryMemeberMapper;
	
	@Test
	public void delete()
	{
		Long[] memberList = {1L,2L,3L};
		EntryMemberVO vo = new EntryMemberVO(1L,memberList);
		
		log.info(entryMemeberMapper.delete(1L));
	}
	
	@Test
	public void update()
	{
		
		EntryMemberVO vo = new EntryMemberVO(1L,4L,5L);
		
		log.info(entryMemeberMapper.update(vo));
	}
	
	@Test
	public void getList()
	{
		entryMemeberMapper.getList(1L).forEach((vo)->log.info(vo));
	}
	
	@Test
	public void insert()
	{
		Long[] memberList = {100L};
		EntryMemberVO vo = new EntryMemberVO(1L, memberList);
		log.info(entryMemeberMapper.insert(vo));
	}
	
	@Test
	public void test()
	{
		log.info(entryMemeberMapper);
	}
	
}
