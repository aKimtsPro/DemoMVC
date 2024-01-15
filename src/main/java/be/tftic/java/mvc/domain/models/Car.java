package be.tftic.java.mvc.domain.models;

import lombok.Data;

@Data
public class Car {

    private Long id;
    private String model;
    private String brand;
    private int power;

    public Car(Long id, String model, String brand, int power) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.power = power;
    }
}
