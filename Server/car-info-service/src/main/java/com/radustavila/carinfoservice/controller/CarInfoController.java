package com.radustavila.carinfoservice.controller;

import com.radustavila.carinfoservice.model.Car;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cars")
public class CarInfoController {

    @RequestMapping("/{carId}")
    public Car getCar(@PathVariable("carId") String carId) {

        List<Car> cars = Arrays.asList(
                new Car("1", "Mercedes-Benz EQS"),
                new Car("2", "BMX X6"),
                new Car("3", "Lamborghini Sterrato"),
                new Car("4", "Ferrari Sypder"),
                new Car("5", "Rolls Royce Phantom"),
                new Car("6", "Tesla Model S Plaid"),
                new Car("7", "Tesla Model S"),
                new Car("8", "Volkswagen Golf"),
                new Car("9", "Audi A7 Sportback")
        );

        return cars.stream()
                .filter(car -> car.getCarId().equals(carId))
                .findAny()
                .orElse(null);
    }

}
