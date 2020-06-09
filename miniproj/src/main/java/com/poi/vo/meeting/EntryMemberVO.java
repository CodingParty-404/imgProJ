package com.poi.vo.meeting;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class EntryMemberVO {

	
	private Long meeting, member, changeMember;
	
	private List<Long> memberList;
	
	/**
	 * For Insert
	 * @param meeting
	 * @param memberList
	 */
	public EntryMemberVO(Long meeting, Long[] memberList){
		
		this.meeting = meeting;
		this.memberList = Arrays.asList(memberList);
	}
	
	/**
	 * For Update
	 * @param meeting
	 * @param targetMember
	 * @param changeMember
	 */
	public EntryMemberVO(Long meeting, Long targetMember, Long changeMember)
	{
		this.meeting = meeting;
		this.member = targetMember;
		this.changeMember = changeMember;
	}
	
	public EntryMemberVO setInsert(Long meeting, Long[] memberList){
		
		this.meeting = meeting;
		this.memberList = Arrays.asList(memberList);
		
		return this;
	}
	
	
	
	
	
	
	
}
