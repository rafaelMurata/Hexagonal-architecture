package com.baeldung.persistence;

import java.util.List;

import com.baeldung.domain.Car;
import com.baeldung.domain.repostory.CarRepositoryPort;

public class DefaultCarServiceAdapter implements CarRepositoryPort {

	@Override
	public void saveCar(String name, String role, Integer age) {
		// Default Car Service Adapter 

	}

	@Override
	public Car getCarById(Integer userId) {
		// Default Car Service Adapter 
		return null;
	}

	@Override
	public List<Car> listAllCars() {
		// Default Car Service Adapter 
		return null;
	}

}
