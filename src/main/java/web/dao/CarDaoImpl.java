package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    public List<Car> show(int count, List<Car> list) {
        if (count == 0 || count > 4) return list;
        return list.stream().limit(count)
                .collect(Collectors.toList());
    }
}
