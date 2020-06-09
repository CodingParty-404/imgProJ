package com.poi.service.member;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poi.mapper.MemberMapper;
import com.poi.mapper.RoleMapper;
import com.poi.vo.member.MemberVO;
import com.poi.vo.member.RoleVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	@Autowired
	RoleMapper roleMapper;

	@Transactional
	@Override
	public void memberRegister(MemberVO vo) {
		log.info("register Service...................................................");
		memberMapper.insert(vo);
		roleMapper.insert(new RoleVO(vo.getMno(),vo.getRole()));
	}

	@Override
	public List<Map<String, String>> memberListPrint() {
		return memberMapper.getMemberListAllData();
	}

	@Override
	public MemberVO memberInfoRead(Long mno) {
		return memberMapper.select(mno);
	}

	@Transactional
	@Override
	public void memberModify(MemberVO vo) {
		memberMapper.update(vo);
		roleMapper.delete(new RoleVO(vo.getMno()));
		roleMapper.insert(new RoleVO(vo.getMno(), vo.getRole()));
	}
	
	@Transactional
	@Override
	public void memberDelete(MemberVO vo) {
		roleMapper.delete(new RoleVO(vo.getMno()));
		memberMapper.update(vo);
	}
	

}
