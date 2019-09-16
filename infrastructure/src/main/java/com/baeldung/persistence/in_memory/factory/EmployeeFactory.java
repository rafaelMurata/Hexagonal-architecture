package com.baeldung.persistence.in_memory.factory;

import com.baeldung.domain.repostory.EmployeeRepository;
import com.baeldung.persistence.in_memory.MockemployeeRepository;

public class EmployeeFactory {

    public static EmployeeRepository getMockemployeeRepository(){
    	
    	return new MockemployeeRepository();
    }
  
}