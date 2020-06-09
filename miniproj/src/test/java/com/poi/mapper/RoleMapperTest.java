package com.poi.mapper;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.testparent.TestParent;
import com.poi.vo.member.RoleVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class RoleMapperTest extends TestParent {
	
	@Autowired
	private RoleMapper roleMapper;

	
	@Test
	public void test()
	{
		log.info(roleMapper);
	}

	@Test
	public void getList()
	{
		roleMapper.getList(4L).forEach((vo)->log.info(vo));
	}
	
	@Test
	public void insert()
	{
		Long[] role_no = {1L};
		
		RoleVO dto = new RoleVO(3L, role_no);
		log.info(roleMapper.insert(dto));
		
	}
	
	@Test
	public void update()
	{
		RoleVO dto = new RoleVO();
		dto.setMember_no(4L);
		dto.setRole_no(1L);
		dto.setChangeRole_no(2L);
		
		log.info(roleMapper.update(dto));
	}
	@Test
	public void delete()
	{
		RoleVO dto = new RoleVO();
		dto.setMember_no(4L);
		dto.setRole_no(1L);
		
		log.info(roleMapper.delete(dto));
	}

}
