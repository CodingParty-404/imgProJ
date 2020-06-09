package com.poi.service.center;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poi.mapper.RoomMapper;
import com.poi.mapper.RoomToolsMapper;
import com.poi.vo.room.RoomToolsVO;
import com.poi.vo.room.RoomVO;

@Service
public class CenterServiceImpl implements CenterService {

	@Autowired
	private RoomMapper roomMapper;
	@Autowired
	private RoomToolsMapper roomToolsMapper;

	@Override
	public List<Map<String, String>> printRoomList() {
		return roomMapper.getList();
	}
	
	@Override
	@Transactional
	public void deleteRoom(Long rno) {
		roomToolsMapper.delete(rno);
		roomMapper.update(new RoomVO().deleteSet(rno));
	}

	@Override
	@Transactional
	public void addRoom(RoomVO vo) {
		roomMapper.insert(vo);
		roomToolsMapper.insert(new RoomToolsVO().insertSet(vo.getRno(), vo.getTools()));
	}

	@Override
	@Transactional
	public void modifyRoom(RoomVO vo) {
		roomToolsMapper.delete(vo.getRno());
		roomToolsMapper.insert(new RoomToolsVO().insertSet(vo.getRno(), vo.getTools()));
		roomMapper.update(vo);
	}

}
