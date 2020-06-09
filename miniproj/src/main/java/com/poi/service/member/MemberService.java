package com.poi.service.member;

import java.util.List;
import java.util.Map;

import com.poi.vo.member.MemberVO;

public interface MemberService {

	
	public List<Map<String, String>> memberListPrint();
	
	public void memberModify(MemberVO vo);

	public MemberVO memberInfoRead(Long mno);

	public void memberDelete(MemberVO mno);
	
	public void memberRegister(MemberVO vo);


	
}
