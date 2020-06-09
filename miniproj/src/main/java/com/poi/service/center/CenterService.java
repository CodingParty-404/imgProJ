package com.poi.service.center;

import java.util.List;
import java.util.Map;

import com.poi.vo.room.RoomVO;

public interface CenterService {
	
	public List<Map<String,String>> printRoomList();
	
	public void deleteRoom(Long rno);
	
	public void addRoom(RoomVO vo);
	
	public void modifyRoom(RoomVO vo);
	
	
	
}
