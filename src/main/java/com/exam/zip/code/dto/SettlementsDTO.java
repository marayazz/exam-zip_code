package com.exam.zip.code.dto;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZoneType() {
		return zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}
	
	

}
