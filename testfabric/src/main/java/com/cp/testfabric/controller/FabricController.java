package com.cp.testfabric.controller;

import java.util.List;

import com.cp.testfabric.mapper.FabricMapper;
import com.cp.testfabric.vo.FabricVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class FabricController {

    @Autowired
	private FabricMapper mapper;
    
    @GetMapping("/canvas")
    public void canvas(Model model)
    {
        //String json = mapper.selectJSON(1L).getJson();
		//model.addAttribute("json", json);
        
    }

    // save버튼 누르면 db에 json과 SVG가 저장되는 컨트롤러
	@PostMapping("/canvas")
	public void canvasSave(FabricVO vo)
	{
		log.info("Post CANVAS.................................");
		log.info(vo);
		mapper.insert(vo);
	}



	@GetMapping("/read")
	public void read(Model model){

		log.info("Post showData.................................");
		
		List<FabricVO> list = mapper.getList();
		// log.info(list);
		model.addAttribute("list", list);

	}


	@GetMapping("/sprite")
    public void sprite(Model model)
    {
        // String json = mapper.selectJSON(1L).getJson();
		// model.addAttribute("json", json);
        
	}
	@PostMapping("/sprite")
	public void sprite(FabricVO vo)
	{
		log.info("Sprite Post ...........................");
		log.info(vo);
		mapper.insert(vo);
		
	}
	
	@GetMapping("/human")
    public void human(Model model)
    {
        //String json = mapper.selectJSON(1L).getJson();
		//model.addAttribute("json", json);
        
	}
	

	@PostMapping("/human")
    public void humanSave(FabricVO vo)
    {
		log.info("Post HUMAN.................................");
		log.info(vo);
		mapper.insert(vo);       
    }

    

}