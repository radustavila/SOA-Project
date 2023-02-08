package com.radustavila.usercarservice.controller;

import com.radustavila.usercarservice.model.UserCar;
import com.radustavila.usercarservice.model.UserCarDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user-cars")
public class UserCarController {

    private List<UserCar> cars = Arrays.asList(
            new UserCar("1", 100000),
            new UserCar("2", 85000),
            new UserCar("3", 50000),
            new UserCar("5", 60000),
            new UserCar("6", 550000),
            new UserCar("7", 550000),
            new UserCar("9", 40000)
    );

    @RequestMapping("users/{userId}")
    public UserCarDto getUserCars(@PathVariable("userId") String userId) {
        return new UserCarDto(cars);
    }

    /*

    @RequestMapping("/{carId}")
    public UserCar getUserCar(@PathVariable("carId") String carId) {
        return new UserCar(carId, 10000);
    }

     */
}
