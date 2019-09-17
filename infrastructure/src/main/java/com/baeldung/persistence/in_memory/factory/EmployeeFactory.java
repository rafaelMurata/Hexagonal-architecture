package com.baeldung.persistence.in_memory.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.baeldung.domain.repostory.EmployeeRepository;
import com.baeldung.persistence.EmployeeEnum;
import com.baeldung.persistence.in_memory.MockEmployeeService;
import com.baeldung.persistence.in_mongo.MongoDBEmployeeService;

@Component
public class EmployeeFactory {

	@Autowired
	private MockEmployeeService mockEmployeeService;
	
	@Autowired
	private MongoDBEmployeeService mongoDBEmployeeService;
	
	public EmployeeRepository getConnection(String typeConnection) {
		
		if(typeConnection == null){
	         return null;
	      }		
	      if(typeConnection.equalsIgnoreCase(EmployeeEnum.MONGODB.name())){
	         return  mongoDBEmployeeService;
	         
	      } else if(typeConnection.equalsIgnoreCase(EmployeeEnum.MEMORY.name())){
	         return mockEmployeeService;
	         
	      }
	      
		return null;
		
	}
  
}