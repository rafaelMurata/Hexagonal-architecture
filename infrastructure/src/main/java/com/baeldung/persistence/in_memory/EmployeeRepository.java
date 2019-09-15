package com.baeldung.persistence.in_memory;

import java.util.List;

import com.baeldung.domain.Employee;

public interface EmployeeRepository {

    void saveEmployee(String name, String role, Integer age);

    Employee getEmployeeById(Integer userId);

	List<Employee> listAllEmployees();
}