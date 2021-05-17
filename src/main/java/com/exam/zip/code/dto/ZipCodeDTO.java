package com.exam.zip.code.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZipCodeDTO {
	
	private String zipCode;
	
	private String locality;
	
	private String federalEntity;
	
	private String municipality;
	
	private SettlementsDTO settlementsDTO;
	
	public ZipCodeDTO() {}

	public ZipCodeDTO(String zipCode, String locality, String federalEntity, String municipality,
			SettlementsDTO settlementsDTO) {
		super();
		this.zipCode = zipCode;
		this.locality = locality;
		this.federalEntity = federalEntity;
		this.municipality = municipality;
		this.settlementsDTO = settlementsDTO;
	}

}
