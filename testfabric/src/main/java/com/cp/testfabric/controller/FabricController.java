package com.cp.testfabric.controller;

import com.cp.testfabric.service.FabricService;
import com.cp.testfabric.vo.FabricVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class FabricController {
    
    @Autowired
    private FabricService service;

    @GetMapping("/canvas")
    public void canvas()
    {
        
    }

    @PostMapping("/export")
    public RedirectView export(FabricVO vo, RedirectAttributes rttr)
    {
        log.info("export post........................................");
        log.info(vo);
        String str = service.toSVG(vo).getSvg();
        log.info(str);
        rttr.addFlashAttribute("svg", str);


        return new RedirectView("/canvas");
    }
}