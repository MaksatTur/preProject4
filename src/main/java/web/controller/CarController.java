package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @RequestMapping(method = RequestMethod.GET)
    public String printCars(@RequestParam(value = "locale", required = false) String local, ModelMap model) {
        List<Car> cars = CarService.initCars();
        model.addAttribute("cars", cars);
        model.addAttribute("locale", local);
        return "cars";
    }
}
