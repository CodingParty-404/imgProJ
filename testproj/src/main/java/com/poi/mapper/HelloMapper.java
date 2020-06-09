package com.poi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface HelloMapper {
	
	@Select("select * from tbl_member_auth where userid = #{userid}")
	public List<Map<String,String>> hello(String userid);

}
