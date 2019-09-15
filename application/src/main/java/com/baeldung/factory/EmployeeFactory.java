package com.baeldung.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baeldung.persistence.in_memory.EmployeeRepository;
import com.baeldung.persistence.in_memory.MockemployeeRepository;

@Repository
public class EmployeeFactory {

    @Autowired
    private EmployeeRepository getMockemployeeRepository;
    
    public static EmployeeRepository getMockemployeeRepository(){
    	
    	return new MockemployeeRepository();
    }

  
}