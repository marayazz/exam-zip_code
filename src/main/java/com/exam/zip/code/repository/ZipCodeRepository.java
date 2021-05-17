package com.exam.zip.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.zip.code.model.ZipCodeBO;

@Repository
public interface ZipCodeRepository extends JpaRepository<ZipCodeBO, String>{

}
