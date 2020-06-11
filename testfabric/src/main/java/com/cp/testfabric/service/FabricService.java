package com.cp.testfabric.service;

import java.io.IOException;

import com.cp.testfabric.vo.FabricVO;

import org.im4java.core.IM4JavaException;

public interface FabricService {

    public FabricVO toSVG(FabricVO vo) throws IOException, InterruptedException, IM4JavaException;
    

}