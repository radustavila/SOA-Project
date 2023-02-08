package com.radustavila.carcatalogservice.controller;

import com.radustavila.carcatalogservice.model.Car;
import com.radustavila.carcatalogservice.model.CarCatalogItem;
import com.radustavila.carcatalogservice.model.UserCarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/catalog")
public class CarCatalogController {

    public static final String USER_CAR_SERVICE_USER_CARS_USERS_URL = "http://user-car-service/user-cars/users/";
    public static final String CAR_INFO_SERVICE_CARS_URL = "http://car-info-service/cars/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<CarCatalogItem> getCar(@PathVariable("userId") String userId) {

        UserCarDto cars = restTemplate.getForObject(USER_CAR_SERVICE_USER_CARS_USERS_URL + userId, UserCarDto.class);

        // Get all cars' ids per user
        // For each car id call car info service and get details
        // Assemble all together and return

        return cars.getUserCars().stream().map(car -> {
//            Car carInfo = webClientBuilder.build()
//                    .get()
//                    .uri("http://localhost:8082/cars/" + car.getId())
//                    .retrieve()
//                    .bodyToMono(Car.class)
//                    .block();

            Car carInfo = restTemplate.getForObject(CAR_INFO_SERVICE_CARS_URL + car.getId(), Car.class);
            return new CarCatalogItem(carInfo.getCarName(), car.getPrice(),
                    new Random().ints(100, 1000).findFirst().getAsInt());
        }).collect(Collectors.toList());
    }
}
