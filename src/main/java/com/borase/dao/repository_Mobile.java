package com.borase.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.borase.model.model_Mobile;
import java.lang.String;
import java.util.List;
@Repository
public interface repository_Mobile extends JpaRepository<model_Mobile, Long> {

	@Query(value = "SELECT * FROM model_mobile WHERE company = :cmp",nativeQuery = true)
	public List<model_Mobile> mb(@Param("cmp") String company);
}

//model_Mobile findByCompany(String company);
//model_Mobile findByModel(String model);
//model_Mobile findByCompanyAndModel(String company, String model);
//model_Mobile save(double discount);
