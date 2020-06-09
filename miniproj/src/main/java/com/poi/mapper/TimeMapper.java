package com.poi.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("Select now()")
	public String getTime();
	
	
}
