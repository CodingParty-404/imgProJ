package com.poi.vo.room;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RoomVO {
	
	private Long rno;
	private String name, position, company;
	private Long[] tools;
	private LocalDateTime regDate,modiDate;
	
	
	public RoomVO insertSet(String name, String position, String company, Long[] tools)
	{
		this.name = name;
		this.position = position;
		this.company = company;
		this.tools = tools;
		
		return this;
	}
	

	public RoomVO deleteSet(Long rno)
	{
		this.rno = rno;
		this.name = "삭제되었습니다.";
		this.position = "삭제되었습니다.";
		this.company = "삭제되었습니다.";
		return this;
	}
	
	public RoomVO updateSet(Long rno, String name, String position, String company,Long[] tools)
	{
		this.rno = rno;
		this.name = name;
		this.position = position;
		this.company = company;
		this.tools = tools;
		return this;
	}
}
