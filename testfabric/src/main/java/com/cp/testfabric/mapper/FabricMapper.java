package com.cp.testfabric.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FabricMapper {
    
    @Select("select now()")
    public String timeSelect();
}