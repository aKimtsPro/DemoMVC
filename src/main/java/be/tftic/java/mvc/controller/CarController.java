package be.tftic.java.mvc.controller;

import be.tftic.java.mvc.domain.models.Car;
import be.tftic.java.mvc.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{id:^[0-9]+$}")
    public String getOne(Model model, @PathVariable long id){
        Car car = carService.getOne(id);
        model.addAttribute("car", car);
        return "car/details";
    }

    @GetMapping({"","/all"})
    public String getAll(Model model){
        model.addAttribute("cars", carService.getAll());
        return "car/list";
    }
}
