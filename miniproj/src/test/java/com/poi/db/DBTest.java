package com.poi.db;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.testparent.TestParent;

import lombok.extern.log4j.Log4j;


@Log4j
public class DBTest extends TestParent{
	
	@Autowired
	private DataSource da;
	
	@Test
	public void jTest()
	{
		log.info("hello Junit");
	}
	
	@Test
	public void connTest() throws Exception
	{
		Connection conn = da.getConnection();
		log.info(conn);
		conn.close();
	}

}
