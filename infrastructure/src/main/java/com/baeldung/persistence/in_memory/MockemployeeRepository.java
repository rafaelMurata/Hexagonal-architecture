package com.baeldung.persistence.in_memory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baeldung.domain.Employee;
import com.baeldung.domain.repostory.EmployeeRepository;


@Service
public class MockemployeeRepository implements EmployeeRepository {

	  @PersistenceContext
	    private EntityManager entityManager;
	    
	    @Transactional
	    @Override
	    public void saveEmployee(String name, String role, Integer age) {
	        Employee employee = new Employee();
	        employee.setName(name);
	        employee.setAge(age);
	        entityManager.persist(employee);
	    }

	    @Override
	    public Employee getEmployeeById(Integer userId) {
	        return entityManager.find(Employee.class, userId);
	    }

		@Override
		public List<Employee> listAllEmployees() {
			  TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
			  List<Employee> employees = query.getResultList();		  
			return employees;
		}

}
