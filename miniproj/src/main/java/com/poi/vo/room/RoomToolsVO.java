package com.poi.vo.room;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RoomToolsVO {

	private Long rno,tool, changeTool_no;
	private List<Long> toolList;
	
//	/**
//	 * for Insert
//	 */
//	public RoomToolsVO(Long rno, Long[] toolList) {
//		this.rno = rno;
//		this.toolList = Arrays.asList(toolList);
//	}
	
	/**
	 * For INSERT
	 * @param rno | Room Number
	 * @param toolList | toolList Array
	 * @return this
	 */
	public RoomToolsVO insertSet(Long rno, Long[] toolList)
	{
		this.rno = rno;
		this.toolList = Arrays.asList(toolList);
		return this;
	}
	
}
