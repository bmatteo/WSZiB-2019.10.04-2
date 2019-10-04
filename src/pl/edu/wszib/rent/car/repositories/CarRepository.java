package pl.edu.wszib.rent.car.repositories;

import pl.edu.wszib.rent.car.model.Car;

public class CarRepository {
    private Car[] cars = new Car[10];

    public void addCar(Car car) {
        for(int i = 0; i < this.cars.length; i++) {
            if(this.cars[i] == null) {
                this.cars[i] = car;
                break;
            }
        }
    }

    public Car getCar(int carId) {
        for(int i = 0; i < this.cars.length; i++) {
            if(this.cars[i].getCarId() == carId) {
                return this.cars[i];
            }
        }

        return null;
    }

    public Car[] getAllCars() {
        return this.cars;
    }

    public Car[] getNotRentCars() {
        Car[] result = new Car[this.cars.length];
        int pomIndex = 0;
        for(int i = 0; i < this.cars.length; i++) {
            if(!this.cars[i].isRent()) {
                result[pomIndex++] = this.cars[i];
            }
        }
    }
}
