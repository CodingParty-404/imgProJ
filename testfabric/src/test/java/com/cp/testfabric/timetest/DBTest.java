package com.cp.testfabric.timetest;

import com.cp.testfabric.mapper.FabricMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DBTest {
    
    @Autowired
    private FabricMapper mapper;

    @Test
    public void timeTest(){
        mapper.timeSelect();
    }
}