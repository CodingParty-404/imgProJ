package com.cp.testfabric.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.cp.testfabric.mapper")
public class MyBatisConfig {
    
}