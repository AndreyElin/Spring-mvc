package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private final CarService carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String printCars(@RequestParam("count") int count, Model model) {
        model.addAttribute("listCars",carService.showCars(count));
        return "cars";
    }
}
