package com.poi.mapper;

import java.util.List;

import com.poi.vo.member.RoleVO;

public interface RoleMapper  {

	public List<RoleVO> getList(Long mno);
	
	public int insert(RoleVO dto);
	
	public int update(RoleVO dto);
	
	public int delete(RoleVO dto);
	
}
