package com.radustavila.carcatalogservice.model;

public class Car {

    private String carId;
    private String carName;

    public Car() {
    }

    public Car(String carId, String carName) {
        this.carId = carId;
        this.carName = carName;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
