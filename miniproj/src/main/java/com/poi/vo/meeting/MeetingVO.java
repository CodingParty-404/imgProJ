package com.poi.vo.meeting;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MeetingVO {

	private Long mtno, room, openMember;
	private String title;
	private LocalDateTime reservationStartDate, reservationEndDate,realStartDate,realEndDate, regDate,modiDate;
	private Long[] joinMember;
	
	
	public MeetingVO insertSet(String title, Long openMember, 
			Long room,Long[] joinMember, 
			LocalDateTime reservationStartDate,
			LocalDateTime reservationEndDate)
	{
		this.title = title;
		this.openMember = openMember;
		this.room = room;
		this.joinMember = joinMember;
		this.reservationStartDate = reservationStartDate;
		this.reservationEndDate = reservationEndDate;
		
		return this;
	}
	
	public MeetingVO updateSet(Long mtno, String title, Long room, Long[] joinMember)
	{
		this.mtno = mtno;
		this.title = title;
		this.room = room;
		this.joinMember = joinMember;
		return this;
	}
	
	public MeetingVO realDateSet(Long mtno, LocalDateTime realStartDate, LocalDateTime realEndDate)
	{
		this.mtno = mtno;
		this.realStartDate = realStartDate;
		this.realEndDate = realEndDate;
		return this;
	}
	
	public MeetingVO deleteSet(Long mtno)
	{
		String str = "삭제되었습니다.";
		this.mtno =mtno;
		this.title = str;
		return this;
	}
}
