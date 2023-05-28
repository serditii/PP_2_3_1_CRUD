package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.servise.CarServise;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServise carServise;

    @Autowired
    public CarsController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping
    public String show(@RequestParam(value = "count", required = false, defaultValue = "5") int count
            , ModelMap model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Nissan", "Almera", 14));
        list.add(new Car("Lada", "Vesta", 47));
        list.add(new Car("Uaz", "Patriot", 32));
        list.add(new Car("Kia", "Rio", 58));
        list.add(new Car("Lada", "Largus", 78));
        model.addAttribute("cars", carServise.show(count, list));
        return "cars";
    }
}
