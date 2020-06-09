package com.cp.mapper;

import com.cp.vo.FabricVO;

public interface FabricMapper {

	
	public int insert(FabricVO vo);
	public FabricVO select(Long fno);
	public int update(FabricVO vo);
	public int delete(Long fno);
	
	
}
