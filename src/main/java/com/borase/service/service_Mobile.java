package com.borase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.borase.dao.repository_Mobile;
import com.borase.model.model_Mobile;
@Service
public class service_Mobile {
	@Autowired
	repository_Mobile rep; // Object of Repository class.
	
//	public model_Mobile addMobile(model_Mobile mobile) {
//		model_Mobile mb = rep.findByCompanyAndModel(mobile.getCompany(), mobile.getModel());
//		if (mb == null) {
//			return rep.save(mobile);
//		} else {
//			return new model_Mobile();
//		}
//	}
//	public List<model_Mobile> getAllData() {
//		return rep.findAll();
//	}
//	public String updateMobile(model_Mobile mobile) {
//		rep.save(mobile);
//		return "Data is updated";
//	}
//	public String deleteMobile( Long id) {
//		model_Mobile mb = new model_Mobile();
//		mb.setId(id);
//		rep.delete(mb);
//		return "Data has been deleted";
//	}
//	public model_Mobile getData(String company, String model) {
//		return rep.findByCompanyAndModel(company, model);
//	}
//	public String deleteData(String company, String model) {
//		model_Mobile mbl = rep.findByCompanyAndModel(company, model);
//		mbl.setCompany(company);
//		mbl.setModel(model);
//		rep.delete(mbl); 
//		return "Data deleted by company and model";
//	}
//	public model_Mobile disAmount(String company,String model) {
//		model_Mobile mb = rep.findByCompanyAndModel(company, model);
//		double realamount=mb.getPrice()/100*15;
//		double discount=mb.getPrice()-realamount;
//		return rep.save(discount);
//	}
	// Service
	public List<model_Mobile> mb(String company) {
		return rep.mb(company);
	}
}


















