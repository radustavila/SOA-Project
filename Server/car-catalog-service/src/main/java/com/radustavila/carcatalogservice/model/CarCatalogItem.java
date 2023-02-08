package com.radustavila.carcatalogservice.model;

public class CarCatalogItem {

    private String name;
    private int price;
    private int hp;

    public CarCatalogItem(String name, int price, int hp) {
        this.name = name;
        this.price = price;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
