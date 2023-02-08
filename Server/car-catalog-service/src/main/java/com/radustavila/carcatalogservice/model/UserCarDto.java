package com.radustavila.carcatalogservice.model;

import java.util.List;

public class UserCarDto {

    private List<UserCar> userCars;

    public UserCarDto() {
    }

    public UserCarDto(List<UserCar> userCars) {
        this.userCars = userCars;
    }

    public List<UserCar> getUserCars() {
        return userCars;
    }

    public void setUserCars(List<UserCar> userCars) {
        this.userCars = userCars;
    }
}
