package web.servise;

import web.models.Car;

import java.util.List;

public interface CarServise {

    List<Car> show(int count, List<Car> list);

}
