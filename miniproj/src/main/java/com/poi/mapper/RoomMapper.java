package com.poi.mapper;

import java.util.List;
import java.util.Map;

import com.poi.vo.room.RoomVO;

public interface RoomMapper extends CRUDMapper<RoomVO, Long> {

	public List<Map<String,String>> getList();
	
}
