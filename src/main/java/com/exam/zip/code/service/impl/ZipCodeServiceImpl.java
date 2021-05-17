package com.exam.zip.code.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.exam.zip.code.dto.SettlementsDTO;
import com.exam.zip.code.dto.ZipCodeDTO;
import com.exam.zip.code.model.ZipCodeBO;
import com.exam.zip.code.repository.ZipCodeRepository;
import com.exam.zip.code.service.ZipCodeService;


@Service
public class ZipCodeServiceImpl implements ZipCodeService{
	
	@Autowired
	private ZipCodeRepository zipCodeRepository;

	@Override
	public ResponseEntity<?> getZipCode(String dCodigo) {
		
		Optional<ZipCodeBO> zipCodeBO = zipCodeRepository.findById(dCodigo);
		
		if(!zipCodeBO.isPresent())
			return new ResponseEntity<>("The zip code don´t exist or isn´t registered", HttpStatus.NOT_FOUND);
		
		
		ZipCodeDTO zipCodeDTO = getZipCodeDTO(zipCodeBO.get());
		
		return new ResponseEntity<>(zipCodeDTO,HttpStatus.ACCEPTED);
	}
	
	
	private ZipCodeDTO getZipCodeDTO(ZipCodeBO zipCodeBO) {
		
		ZipCodeDTO zipCodeDTO = new ZipCodeDTO();
		
		zipCodeDTO.setZipCode(zipCodeBO.getDCodigo());
		zipCodeDTO.setLocality(zipCodeBO.getDCiudad());
		zipCodeDTO.setFederalEntity(zipCodeBO.getCEstado());
		zipCodeDTO.setMunicipality(zipCodeBO.getDmnpio());
		zipCodeDTO.setSettlementsDTO(getSettlementsDTO(zipCodeBO));
		
		
		
		return zipCodeDTO;
	}
	
	private SettlementsDTO getSettlementsDTO(ZipCodeBO zipCodeBO) {
		
		SettlementsDTO settlementsDTO = new SettlementsDTO();
		
		settlementsDTO.setName(zipCodeBO.getDAsenta());
		settlementsDTO.setSettlementType(zipCodeBO.getIdAsentaCpcons());
		settlementsDTO.setZoneType(zipCodeBO.getDTipoAsenta());
		
		return settlementsDTO;
	}

}
