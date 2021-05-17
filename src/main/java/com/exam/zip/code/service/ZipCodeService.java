package com.exam.zip.code.service;

import org.springframework.http.ResponseEntity;


public interface ZipCodeService {
	
	public ResponseEntity<?> getZipCode(String dCodigo );

}
