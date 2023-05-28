package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDao {

    List<Car> show(int count, List<Car> list);

}
