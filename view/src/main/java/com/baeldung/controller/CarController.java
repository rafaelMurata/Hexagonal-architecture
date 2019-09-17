package com.baeldung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.domain.Car;
import com.baeldung.persistence.enums.CarEnum;
import com.baeldung.persistence.in_memory.factory.CarFactory;

@RestController
@RequestMapping("/cars/")
public class CarController {

	@Autowired
    private CarFactory carFactory;

    @PostMapping("create")
    public void create(@RequestBody Car request) {
    	carFactory.getConnection(CarEnum.MEMORY.name()).saveCar(request.getName(), request.getName(), request.getAge());
    }
    
    @GetMapping("getCarById/{id}")
    public Car getCarById(@PathVariable Integer id) {
    	Car car = carFactory.getConnection(CarEnum.MEMORY.name()).getCarById(id);
        return car;
    }
    
    @GetMapping("listAllCars")
    public List<Car> listAllCars() {
    	List<Car> cars = carFactory.getConnection(CarEnum.MEMORY.name()).listAllCars();
        return cars;
    }
}