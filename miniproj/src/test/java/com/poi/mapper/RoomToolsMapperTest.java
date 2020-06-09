package com.poi.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.testparent.TestParent;
import com.poi.vo.room.RoomToolsVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class RoomToolsMapperTest extends TestParent {

	@Autowired
	private RoomToolsMapper roomToolsMapper;
	
	
	@Test
	public void delete()
	{
		log.info(roomToolsMapper.delete(1L));
	}
	
	@Test
	public void update()
	{
		RoomToolsVO vo = new RoomToolsVO();
		vo.setRno(1L);
		vo.setTool(3L);
		vo.setChangeTool_no(4L);
		roomToolsMapper.update(vo);
	}
	
	@Test
	public void getList()
	{
		roomToolsMapper.getList(1L).forEach((vo)->log.info(vo));
	}
	
	@Test
	public void insert()
	{
		Long[] toolList = {1L,2L,3L};
		log.info(roomToolsMapper.insert(new RoomToolsVO().insertSet(11L, toolList)));
	}
	
	@Test
	public void test()
	{
		log.info(roomToolsMapper);
	}
	
	
	
}
