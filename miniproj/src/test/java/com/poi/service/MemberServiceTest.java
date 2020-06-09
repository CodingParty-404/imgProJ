package com.poi.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.service.member.MemberService;
import com.poi.testparent.TestParent;
import com.poi.vo.member.MemberVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class MemberServiceTest extends TestParent {

	@Autowired
	private MemberService memberService;
	
	@Test
	public void memberDelete()
	{
		MemberVO vo = new MemberVO(1027L);
		memberService.memberDelete(vo);
	}
	
	@Test
	public void memberModifyTest()
	{
		MemberVO vo = new MemberVO(1031L, "짱연욱","4321", new Long[] {2L});
		memberService.memberModify(vo);
	}
	
	@Test
	public void memberregister()
	{
		MemberVO vo = new MemberVO();
		vo.setName("킹연욱");
		vo.setEmail("kingnabang11@naver.com");
		vo.setPassword("1234");
		vo.setCompany("BitCamp");
		vo.setDept("100");
		vo.setRole(new Long[] {1L,2L});
		memberService.memberRegister(vo);
	}
	
	@Test
	public void memberInfoRead()
	{
		log.info(memberService.memberInfoRead(5L));
	}
	@Test
	public void memberGetList()
	{
		memberService.memberListPrint().forEach((a)->log.info(a));
	}
	
	
	@Test
	public void beanTest()
	{
		log.info(memberService);
	}
	
}
