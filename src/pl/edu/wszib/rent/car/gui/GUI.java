package pl.edu.wszib.rent.car.gui;

import pl.edu.wszib.rent.car.model.Car;
import pl.edu.wszib.rent.car.repositories.CarRepository;

import java.util.Scanner;

public class GUI {
    public static void showMenu() {
        System.out.println("1. Available list");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        String linia = scanner.nextLine();

        switch (linia) {
            case "1":
                Car[] availableCars = CarRepository.carRepository.getNotRentCars();
                for(Car c : availableCars) {
                    if(c != null) {
                        System.out.println(c.getBrand() + " - " + c.getModel() + " - " + c.getCarId());
                    }
                }
                showMenu();
                break;
            case "2":
                rentCarMenu();
                showMenu();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                showMenu();
                break;
        }
    }

    public static void rentCarMenu() {
        System.out.println("Write carId:");

        Scanner scanner = new Scanner(System.in);
        String givenCarId = scanner.nextLine();

        try {
            Car car = CarRepository.carRepository.getCar(Integer.parseInt(givenCarId));
            if(car != null) {
                car.setRent(true);
            }
        } catch (NumberFormatException e) {
            System.out.println("carId not correct !!");
        }
    }
}
