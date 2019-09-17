package com.baeldung.domain.repostory;

import java.util.List;

import com.baeldung.domain.Car;

public interface CarRepositoryPort {

    void saveCar(String name, Integer age);

    Car getCarById(Integer userId);

	List<Car> listAllCars();
}