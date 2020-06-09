package com.poi.vo.member;


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
public class RoleVO {

	private Long member_no, role_no, changeRole_no;
	private String roleName;
	private List<Long> roleList;
	
	/**
	 * For Insert 
	 * @param member_no
	 * @param role_no
	 */
	public RoleVO(Long member_no, Long[] role_no) {
		this.member_no = member_no;
		this.roleList = Arrays.asList(role_no);
	}
	/**
	 * For DELETE
	 * @param member_no
	 */
	public RoleVO(Long member_no)
	{
		this.member_no = member_no;
	}
	
}
