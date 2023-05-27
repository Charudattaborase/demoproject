package com.borase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.borase.dao.repository_Mobile;
import com.borase.model.model_Mobile;
import com.borase.service.service_Mobile;

@RestController
public class controller_Mobile {
	@Autowired
	repository_Mobile rep;
	@Autowired
	service_Mobile sr;

//	@GetMapping("/get_data")
//	public List<model_Mobile> getData() {
//		return sr.getAllData();
//	}
//
//	@PutMapping("/update")
//	public String updateMob(@RequestBody model_Mobile mob) {
//		return sr.updateMobile(mob);
//	}
//
//	@DeleteMapping("/delete")
//	public String deleteMob(@RequestParam("dltm") Long id) {
//		return sr.deleteMobile(id);
//	}
//
//	@GetMapping("/extra-get")
//	public model_Mobile getData(@RequestParam("cmp") String company, @RequestParam("mdl") String model) {
//		return sr.getData(company, model);
//	}
//	@PostMapping("/extra-add")
//	public model_Mobile extraData(@RequestBody model_Mobile mobile) {
//		return sr.addMobile(mobile); 
//	}
//	@DeleteMapping("/delete-data")
//	public String deleteData(@RequestParam("cmp") String company,@RequestParam("mdl") String model) {
//		return sr.deleteData(company,model);
//	}
	// Controller
	@GetMapping("/test-api")
	public List<model_Mobile> mb(@RequestParam("cmpName") String company){
		return sr.mb(company);
	}
	
	
	
	
	
	
	//	@GetMapping("/dis-amt")
//	public model_Mobile disamount(@RequestParam("cmp") String company,@RequestParam("mdl") String model) {
//		return sr.disAmount(company,model);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
