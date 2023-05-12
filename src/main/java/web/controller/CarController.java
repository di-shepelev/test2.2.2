package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;
import web.service.CarServicelmpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class CarController {

    private final CarServicelmpl carServicelmpl;

    public CarController(CarServicelmpl carServicelmpl) {
        this.carServicelmpl = carServicelmpl;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int value, Model model) {

        model.addAttribute("cars",carServicelmpl.getCarCount(value));

        return "cars";
    }
}
