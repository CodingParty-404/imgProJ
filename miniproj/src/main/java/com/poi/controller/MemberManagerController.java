package com.poi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.poi.service.member.MemberService;
import com.poi.vo.member.MemberVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/membermanager/*")
@Log4j
public class MemberManagerController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/memberlist")
	public void memberList(Model model)
	{
		log.info("MemberList Page..................................:");
		//멤버 리스트 출력 Page
		//MemberManager - balsamiq refer
		model.addAttribute("list", memberService.memberListPrint());
		log.info(model);
	}
	
	@GetMapping("/memberinfo")
	public void memberinfo(Model model, Long mno)
	{
		log.info("MemberInfo Page..........................................");
		model.addAttribute("info", memberService.memberInfoRead(mno));
		log.info(model);
	}
	
	@PostMapping("/register")
	public String memberRegister(MemberVO vo, RedirectAttributes rttr)
	{
		log.info("MemberRegister Page................................................");
		log.info("memberInfo : "+vo);
		memberService.memberRegister(vo);
		
		rttr.addFlashAttribute("result", "가입되었습니다.");
		return "redirect:/membermanager/memberlist";
	}
	@PostMapping("/modify")
	public String memberModify(MemberVO vo, RedirectAttributes rttr)
	{
		log.info("MemberModify Post......................................................");
		memberService.memberModify(vo);
		rttr.addFlashAttribute("result","처리완료");
		return "redirect:/membermanager/memberlist";
	}
	@PostMapping("/delete")
	public String memberDelete(Long mno, RedirectAttributes rttr)
	{
		log.info("MemberDelete Post........................................................");
		memberService.memberDelete(new MemberVO(mno));
		rttr.addFlashAttribute("result", "처리완료");
		return "redirect:/membermanager/memberlist";
	}
	
	
}
