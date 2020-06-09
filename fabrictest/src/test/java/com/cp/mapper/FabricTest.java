package com.cp.mapper;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cp.vo.FabricVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class FabricTest {

	@Autowired
	private FabricMapper fabricMapper;

	
	@Test
	public void selectTest()
	{
		
		log.info(fabricMapper.select(1L) );
	}
	
	@Test
	public void insertTest()
	{
		FabricVO vo = FabricVO.builder().json("asdasdas:asdasd").build();
		
		log.info(fabricMapper.insert(vo));
	}
	
	
	@Test
	public void basicTest()
	{
		log.info(fabricMapper);
	}
	
	
	
}
