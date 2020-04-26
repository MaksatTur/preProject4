package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    public static List<Car> initCars() {
        return Arrays.asList(
                new Car("BMW", "Pupkin", "M8"),
                new Car("Lexus", "Ivanov", "LX570"),
                new Car("Mercedes", "Petrov", "GT"));
    }
}
