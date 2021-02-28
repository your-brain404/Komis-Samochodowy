package cars.elements;

public class Engine {
    private float displacement;
    private String name;
    private int power, mileage;

    public Engine(float displacement, String name, int power, int mileage) {
        this.displacement = displacement;
        this.name = name;
        this.power = power;
        this.mileage = mileage;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
