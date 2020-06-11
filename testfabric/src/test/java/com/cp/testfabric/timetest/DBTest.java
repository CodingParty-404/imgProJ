package com.cp.testfabric.timetest;

import com.cp.testfabric.mapper.FabricMapper;
import com.cp.testfabric.vo.FabricVO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class DBTest {
    
    @Autowired
    private FabricMapper mapper;


    @Test
    public void select() {

        FabricVO vo = new FabricVO();
        vo.setFbno(1L);
        String str =mapper.selectFabric(vo).getSvg();
        log.info(str);
    }

    @Test
    public void timeTest(){
        mapper.timeSelect();
    }
}