package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServicelmpl implements CarServise {

    private final CarDao cardao;

    public CarServicelmpl(CarDao cardao) {
        this.cardao = cardao;
    }


    @Override
    public List<Car> getCarCount(int value) {
        return cardao.getCarCount(value);
    }

}
