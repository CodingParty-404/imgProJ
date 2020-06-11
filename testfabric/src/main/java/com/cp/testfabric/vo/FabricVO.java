package com.cp.testfabric.vo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FabricVO {
    
    private Long fbno;
    private String json;
    private String svg;
    private LocalDateTime regdate , moddate;
	

}