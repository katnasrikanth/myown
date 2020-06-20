package com.slokam.SBbyid;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	private PatientDao dao;
	
	/*@RequestMapping("patientbyid")
	public Patient getbyid(int id) {
		Optional<Patient> patient= dao.findById(id);
		
		if(patient.isPresent()) {
			return patient.get();
		}else {
			return null;
		}
	}

	@RequestMapping("save")
	public void  save(String name,String gender,Integer age) {
		
		Patient p=new Patient();
		p.setAge(age);
		p.setGender(gender);
		p.setName(name);
		dao.save(p);
	
}  */
	
	@RequestMapping("Hello")
	public void save(@RequestBody Patient p) {
		dao.save(p);
		
		
	}
	
	
	
	
	
}