package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCarList(@RequestParam(value = "count", defaultValue = "5")Integer count, Model model) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("lada", "white", 1990));
        listCar.add(new Car("volga", "green", 1980));
        listCar.add(new Car("zhiguli.", "black", 1970));
        listCar.add(new Car("bmw", "wet asvalt", 2010));
        listCar.add(new Car("mersedes", "cherry", 2015));
        model.addAttribute("listCar", CarService.countCar(listCar, count));
        return "cars";
    }
}
