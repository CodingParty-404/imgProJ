package com.poi.mapper;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.testparent.TestParent;
import com.poi.vo.member.MemberVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class MapperTest extends TestParent {

	@Autowired
	private TimeMapper ti;
	@Autowired
	private MemberMapper memberMapper;
	
	
	@Test
	public void getListMap()
	{
		memberMapper.getMemberListAllData().forEach(vo->log.info(vo));
	}
	
	@Test
	public void timeTest()
	{
		log.info(ti.getTime());
	}
	@Test
	public void getMember()
	{
		log.info(memberMapper.select(5L));
	}
	@Test
	public void getList()
	{
		memberMapper.getList().forEach(vo->log.info(vo));
	}
	@Test
	public void insert()
	{
		MemberVO vo = new MemberVO();
		vo.setName("킹나방");
		vo.setEmail("mamber@gg.co.kr");
		vo.setCompany("BitCamp");
		vo.setDept("100");
		vo.setPassword("1234");
		log.info(memberMapper.insert(vo));
		log.info(vo);
	}
	
	@Test
	public void update()
	{
		MemberVO vo = new MemberVO();
		vo.setMno(6L);
		vo.setName("���ǳ�");
		vo.setEmail("wewe1157@gg.co.kr");
		vo.setCompany("bitCamp");
		vo.setDept("100");
		vo.setPassword("4321");
		log.info(memberMapper.update(vo));
	}
	@Test
	public void delete()
	{
		Long mno = 6L;
		log.info(memberMapper.delete(mno));
	}
	
	
	
	
	
	
	
}
