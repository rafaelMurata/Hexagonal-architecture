package com.baeldung.persistence.in_memory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baeldung.domain.Car;
import com.baeldung.domain.repostory.CarRepositoryPort;

@Service
public class MockCarServiceAdapter implements CarRepositoryPort {

	   @PersistenceContext
	    private EntityManager entityManager;
	    
	    @Override
	    public Car getCarById(Integer userId) {
	        return entityManager.find(Car.class, userId);
	    }

		@Override
		public List<Car> listAllCars() {
			  TypedQuery<Car> query = entityManager.createQuery("SELECT e FROM Car e", Car.class);
			  List<Car> cars = query.getResultList();		  
			return cars;
		}
		
		@Transactional
	    @Override
	    public void saveCar(String name, String role, Integer age) {
	        Car car = new Car();
	        car.setName(name);
	        car.setAge(age);
	        entityManager.persist(car);
	    }
}
