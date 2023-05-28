package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.models.Car;
import java.util.List;

@Component
public class CarServiseImpl implements CarServise {
    private final CarDaoImpl carDao;

    @Autowired
    public CarServiseImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public List<Car> show(int count, List<Car> list) {
        return carDao.show(count, list);
    }
}
