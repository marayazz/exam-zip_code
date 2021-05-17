package com.exam.zip.code.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SettlementsDTO {
	
	private String name;
	
	private String zoneType;
	
	private String settlementType;
	

	public SettlementsDTO() {}

	public SettlementsDTO(String name, String zoneType, String settlementType) {
		super();
		this.name = name;
		this.zoneType = zoneType;
		this.settlementType = settlementType;
	}
	
	

}
