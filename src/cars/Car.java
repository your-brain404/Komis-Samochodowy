package cars;

import cars.elements.Engine;
import cars.types.BodyType;
import cars.types.CarType;

public class Car {
    private String brand, model;
    private BodyType bodyType;
    private CarType carType;
    private int price, productionYear;
    private Engine engine;

    public Car(String brand, String model, BodyType bodyType, CarType carType, int price, int productionYear,
            Engine engine) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.price = price;
        this.productionYear = productionYear;
        this.engine = engine;
        this.carType = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType geCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

}
