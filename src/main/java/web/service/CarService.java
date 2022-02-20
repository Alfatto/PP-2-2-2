package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> countCar(List<Car> listCar, Integer count) {
        if (count > 5) return listCar;
        else if(count < 0) return null;
        else return listCar.stream().limit(count).collect(Collectors.toList());
    }
}