package com.cp.testfabric.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.cp.testfabric.mapper.FabricMapper;
import com.cp.testfabric.vo.FabricVO;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class FabricServiceImpl implements FabricService {

    @Autowired
    private FabricMapper fabricMapper;

    @Override
    public FabricVO toSVG(FabricVO vo) throws IOException, InterruptedException, IM4JavaException {
        
        //svg 다운로드 .xml파일로 만들기.
        String svg = fabricMapper.selectFabric(vo).getSvg();
        log.info("=============================================");
        log.info(svg);
        log.info("=============================================");
        

        FileWriter fw = new FileWriter(new File("../testfabric", "child.svg"));
        fw.write(svg);
        fw.close();

        ConvertCmd cmd = new ConvertCmd();
        IMOperation op = new IMOperation();
        op.addImage("child.svg");
        op.addImage("a.png");
        cmd.run(op);


        //변환해주고 url로 만들어주고 보내준다.
        FabricVO fabricVO = new FabricVO();
        fabricVO.setSvg(svg);
        return fabricVO;
    }
    
}