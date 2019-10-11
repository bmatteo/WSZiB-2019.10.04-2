package pl.edu.wszib.rent.car.repositories;

import pl.edu.wszib.rent.car.model.Car;

public class CarRepository {
    public static final CarRepository carRepository = new CarRepository();
    private CarRepository() {
        Car c1 = new Car("Audi", "A5", 1);
        Car c2 = new Car("BMW", "4", 2);
        Car c3 = new Car("Toyota", "Corolla", 3);
        Car c4 = new Car("Ford", "Mondeo", 4);
        Car c5 = new Car("Mercedes", "C", 5);

        this.cars[0] = c1;
        this.cars[1] = c2;
        this.cars[2] = c3;
        this.cars[3] = c4;
        this.cars[4] = c5;
    }

    private Car[] cars = new Car[5];

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

        return result;
    }
}
