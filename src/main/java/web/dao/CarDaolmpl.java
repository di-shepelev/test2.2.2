package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaolmpl implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("red", "100", "wing"));
        carList.add(new Car("blue", "200", "arrow"));
        carList.add(new Car("green", "300", "knigh"));
        carList.add(new Car("yellow", "400", "arr"));
        carList.add(new Car("orange", "500", "kni"));
    }

    @Override
    public List<Car> getCarCount(int value) {
        if (value > 0 && value < 5) {
            return carList.stream().limit(value).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}
