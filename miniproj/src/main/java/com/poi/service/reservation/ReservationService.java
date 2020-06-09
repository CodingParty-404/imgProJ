package com.poi.service.reservation;

import java.time.LocalDateTime;
import java.util.*;

import com.poi.vo.meeting.MeetingVO;

public interface ReservationService {
	
	public void addReservation(MeetingVO vo);
	
	public void deleteReservation(Long mtno);
	
	public void modiReservation(MeetingVO vo);
	
	public List<Map<String,String>> getResrvationList(Long mtno);
	public List<Map<String,String>> getResrvationListAll();

	public void realStartTimeSet(Long mtno, LocalDateTime realStartTime);
	public void realEndTimeSet(Long mtno, LocalDateTime realEndTime);

}
