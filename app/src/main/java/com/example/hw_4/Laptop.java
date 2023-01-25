package com.example.hw_4;

import java.io.Serializable;

public class Laptop implements Serializable {
    private final String name;
    private final String specs;

    private final String imgLaptop;

    public Laptop(String name, String specs, String imgLaptop) {
        this.name = name;
        this.specs = specs;

        this.imgLaptop = imgLaptop;
    }

    public String getName() {
        return name;
    }

    public String getSpecs() {
        return specs;
    }

    public String getImgLaptop() {
        return imgLaptop;
    }
}
