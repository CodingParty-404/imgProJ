package com.cp.testfabric.service;

import com.cp.testfabric.mapper.FabricMapper;
import com.cp.testfabric.vo.FabricVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FabricServiceImpl implements FabricService {

    @Autowired
    private FabricMapper fabricMapper;

    @Override
    public FabricVO toSVG(FabricVO vo) {
        

        return fabricMapper.selectFabric(vo);
    }
    
}