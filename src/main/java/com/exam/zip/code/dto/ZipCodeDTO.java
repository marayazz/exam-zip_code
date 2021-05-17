package com.exam.zip.code.dto;


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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getFederalEntity() {
		return federalEntity;
	}

	public void setFederalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public SettlementsDTO getSettlementsDTO() {
		return settlementsDTO;
	}

	public void setSettlementsDTO(SettlementsDTO settlementsDTO) {
		this.settlementsDTO = settlementsDTO;
	}
	
	

}
