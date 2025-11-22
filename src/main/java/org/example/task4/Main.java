package org.example.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Car(10000, 2010, 150);
        cars[1] = new Car(10000, 2015, 200);
        cars[2] = new Car(5000, 2005, 100);
        cars[3] = new Car(10000, 2015, 250);

        System.out.println("--- До сортування ---");
        for (Car car : cars) {
            System.out.println("Price: " + car.getPrice() + ", Year: " + car.getYear() + ", HP: " + car.getHorsePower());
        }

        Arrays.sort(cars);

        System.out.println("\n--- Після сортування ---");
        for (Car car : cars) {
            System.out.println("Price: " + car.getPrice() + ", Year: " + car.getYear() + ", HP: " + car.getHorsePower());
        }
    }
}