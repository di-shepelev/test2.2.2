package web.model;

public class Car {
    private String colorCar;

    private String modelCar;

    private String nameCar;

    public Car() {
    }

    public Car(String colorCar, String modelCar, String nameCar) {
        this.colorCar = colorCar;
        this.modelCar = modelCar;
        this.nameCar = nameCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }
}
