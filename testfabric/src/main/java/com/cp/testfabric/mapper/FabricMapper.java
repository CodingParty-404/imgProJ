package com.cp.testfabric.mapper;

import com.cp.testfabric.vo.FabricVO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FabricMapper {
    
    @Select("select now()")
    public String timeSelect();

    @Select("select * from tbl_fabric where fbno = #{fbno}")
    public FabricVO selectFabric(FabricVO vo);
}