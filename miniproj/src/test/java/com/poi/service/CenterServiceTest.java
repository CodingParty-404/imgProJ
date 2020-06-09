package com.poi.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.service.center.CenterService;
import com.poi.testparent.TestParent;
import com.poi.vo.room.RoomVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class CenterServiceTest extends TestParent{

	
	
	@Autowired
	private CenterService centerService;

	@Test
	public void modiRoom()
	{
		centerService.modifyRoom(
				new RoomVO()
				.updateSet(13L, "G1", null, null,new Long[] {1L,2L,3L})
				);
	}
	
	@Test
	public void addRoomTest()
	{
		centerService.addRoom(new RoomVO()
				.insertSet("D1", "4층 좌측", "BitCamp", new Long[] {1L,2L,3L})
				);
	}
	
	@Test
	public void deleteTest()
	{
		centerService.deleteRoom(1L);
	}
	
	@Test
	public void printListTest()
	{
		centerService.printRoomList().forEach((vo)->log.info(vo));
	}
	
	
	@Test
	public void test()
	{
		log.info(centerService);
	}
	
}
