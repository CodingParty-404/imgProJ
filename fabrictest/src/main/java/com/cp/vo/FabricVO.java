package com.cp.vo;

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

	
	private Long fno;
	private String json;
	private LocalDateTime regdate, moddate;
	
}
