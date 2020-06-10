package com.cp.testfabric.mapper;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface FabricMapper {
    
    // @Select("select now()")
    public String timeSelect();
}