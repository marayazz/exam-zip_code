package com.exam.zip.code.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exam.zip.code.service.ZipCodeService;

/*
 * Voy agregar algo para llevarlo a master
 */

@RestController
@CrossOrigin
public class ZipCodeController {

	@Autowired
	private ZipCodeService zipCodeService;
	
	@GetMapping(value = "/zip-codes/{zipCode}")
	public ResponseEntity<?> getZipCode(@PathVariable String zipCode){
		
		return zipCodeService.getZipCode(zipCode);
		
	}
}
