package com.cp.testfabric.controller;

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

    // save버튼 누르면 db에 json이 저장되는 컨트롤러
	@PostMapping("/canvas")
	public void canvasSave(FabricVO vo)
	{
		log.info("Post JSON.................................");
		log.info(vo);
		mapper.insert(vo);
	}

	@PostMapping("/canvasSVG")
	public void SVGsave(FabricVO vo)
	{
		log.info("Post SVG.................................");
		log.info(vo);
		mapper.insertSVG(vo);
	}
    

}