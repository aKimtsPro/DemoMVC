package be.tftic.java.mvc.service;


import be.tftic.java.mvc.domain.models.Car;

import java.util.List;

public interface CarService {

    Car getOne(long id);
    List<Car> getAll();

}
