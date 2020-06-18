package com.cp.testfabric.mapper;

import java.util.List;

import com.cp.testfabric.vo.FabricVO;

public interface FabricMapper {
    
    // 시간 테스트
    public String timeSelect();


    // 본격 코드
    // 1 insert JSON & SVG
    // @Insert("insert into tbl_fabric (json, svg) values (#{json}, #{svg}) ")
    public int insert(FabricVO vo);

    // 2 selectJSON
    // @Select("select json from tbl_fabric where fbno = #{fbno}")
    public FabricVO selectOne(Long fbno);

    // @Select("select * from tbl_fabric where fbno in (1,2,3,4,5,6)")
    public List<FabricVO> getList();






}