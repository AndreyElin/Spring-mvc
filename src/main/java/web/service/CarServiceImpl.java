package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> listCars = new ArrayList<>();

    {
        listCars.add(new Car(1, 700, "Lexus"));
        listCars.add(new Car(2, 1000, "Toyota"));
        listCars.add(new Car(3, 500, "Renault"));
        listCars.add(new Car(4, 900, "Ford"));
        listCars.add(new Car(5, 1200, "BMW"));
    }

    public CarServiceImpl() {
    }

    @Override
    public List<Car> showCars(int n) {
        return n > 0 && n < 5 ? listCars.stream().limit(n).collect(Collectors.toList()) : listCars;
    }
}
