package com.poi.service.reservation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poi.mapper.EntryMemberMapper;
import com.poi.mapper.MeetingMapper;
import com.poi.vo.meeting.EntryMemberVO;
import com.poi.vo.meeting.MeetingVO;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private MeetingMapper meetingMapper;
	@Autowired
	private EntryMemberMapper entryMemberMapper;

	@Transactional
	@Override
	public void addReservation(MeetingVO vo) {
		// TODO Auto-generated method stub
		meetingMapper.insert(vo);
		entryMemberMapper.insert(new EntryMemberVO().setInsert(vo.getMtno(), vo.getJoinMember()));
	}
	
	//realDate = now() 해야함
	@Override
	public void realStartTimeSet(Long mtno, LocalDateTime realStartTime) {
		meetingMapper.update(new MeetingVO().realDateSet(mtno, realStartTime, null));
	}
	@Override
	public void realEndTimeSet(Long mtno, LocalDateTime realEndTime) {
		meetingMapper.update(new MeetingVO().realDateSet(mtno, null, realEndTime));
	}

	
	@Override
	public void deleteReservation(Long mtno) {
		meetingMapper.update(new MeetingVO().deleteSet(mtno));
	}

	@Transactional
	@Override
	public void modiReservation(MeetingVO vo) {
		// TODO Auto-generated method stub
		meetingMapper.update(vo);
		entryMemberMapper.delete(vo.getMtno());
		entryMemberMapper.insert(new EntryMemberVO().setInsert(vo.getMtno(), vo.getJoinMember()));
	}
	@Override
	public List<Map<String, String>> getResrvationList(Long mtno) {
		// TODO Auto-generated method stub
		return meetingMapper.getList(mtno);
	}
	@Override
	public List<Map<String, String>> getResrvationListAll() {

		return meetingMapper.getList();
	}

}
