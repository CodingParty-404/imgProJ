package com.cp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cp.mapper.FabricMapper;
import com.cp.vo.FabricVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/fabric")
@Log4j
public class FabricController {
	
	@Autowired
	private FabricMapper mapper;
	
	@GetMapping("/canvas")
	public void canvas(Model model)
	{
		String json = mapper.select(1L).getJson();
		model.addAttribute("json", json);
	}
	
	@PostMapping("/canvas")
	public void canvasSave(FabricVO vo)
	{
		log.info("Post Canvas.................................");
		log.info(vo);
		mapper.insert(vo);
	}
	
	
}
