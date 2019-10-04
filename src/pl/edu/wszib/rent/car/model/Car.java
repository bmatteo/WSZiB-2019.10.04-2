package pl.edu.wszib.rent.car.model;

public class Car {
    private String brand;
    private String model;
    private int carId;
    private boolean rent;

    public Car(String brand, String model, int carId) {
        this.brand = brand;
        this.model = model;
        this.carId = carId;
        this.rent = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCarId() {
        return carId;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }
}
