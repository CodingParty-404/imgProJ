package com.poi.vo.member;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberVO {
	
	private Long mno;
	private Long[] role;
	private String name, email, password,company,dept;
	private LocalDateTime regDate, modiDate;
	
	
	/**
	 * For Member UPDATE
	 * @param name
	 * @param email
	 * @param password
	 * @param role
	 */
	public MemberVO(Long mno, String name, String password, Long[] role)
	{
		this.mno = mno;
		this.name = name;
		this.password = password;
		this.role = role;
	}
	
	/**
	 * For Member DELETE(basic UPDATE)
	 * @param mno --회원 no
	 */
	public MemberVO(Long mno)
	{
		String del = "삭제되었습니다.";
		this.mno = mno;
		this.name = del;
		this.password = del;
		this.role = null;
		this.company = del;
		this.dept = del;
	}
}
