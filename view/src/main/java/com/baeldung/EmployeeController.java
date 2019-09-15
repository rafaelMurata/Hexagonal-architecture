package com.baeldung;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.domain.Employee;
import com.baeldung.persistence.in_memory.EmployeeRepository;

@RestController
@RequestMapping("/employees/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("create")
    public void create(@RequestBody Employee request) {
	   employeeRepository.saveEmployee(request.getName(), request.getName(), request.getAge());
    }
    
    @GetMapping("getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        Employee employee = employeeRepository.getEmployeeById(id);
        return employee;
    }
    
    @GetMapping("listAllEmployees")
    public List<Employee> listAllEmployees() {
    	List<Employee> employees = employeeRepository.listAllEmployees();
        return employees;
    }
}