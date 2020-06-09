package com.poi.mapper;

import java.util.List;
import java.util.Map;

import com.poi.vo.meeting.MeetingVO;

public interface MeetingMapper extends CRUDMapper<MeetingVO, Long> {

	
	public List<Map<String,String>> getList(Long mtno);

	public List<Map<String, String>> getList();
	
	
}
