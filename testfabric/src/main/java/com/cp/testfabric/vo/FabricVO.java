package com.cp.testfabric.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class FabricVO {
    
    private Long fbno;
    private String json;
    private String svg;
    private LocalDateTime regdate , moddate;

}