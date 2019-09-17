package com.baeldung.persistence.in_mongo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.baeldung.domain.Employee;
import com.baeldung.domain.repostory.EmployeeRepository;

@Component
public class MongoDBEmployeeService implements EmployeeRepository {

	@Override
	public void saveEmployee(String name, String role, Integer age) {
		// mongoDB example

	}

	@Override
	public Employee getEmployeeById(Integer userId) {
		// mongoDB example
		return null;
	}

	@Override
	public List<Employee> listAllEmployees() {
		// mongoDB example
		return null;
	}

}
