package com.cp.testfabric.mapper;

import com.cp.testfabric.vo.FabricVO;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FabricMapper {
    
    // 시간 테스트
    @Select("select now()")
    public String timeSelect();


    // 본격 코드
    // 1 insert JSON & SVG
    @Insert("insert into tbl_fabric (json, svg) values (#{json}, #{svg}) ")
    public int insert(FabricVO vo);

    // 2 selectJSON
    @Select("select json from tbl_fabric where fbno = #{fbno}")
    public FabricVO select(Long fbno);







}