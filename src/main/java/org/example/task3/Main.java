package org.example.task3;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();

        System.out.println("--- Тестування GPS ---");
        double[] coords = myPhone.getCoordinates();
        System.out.println("Координати: " + coords[0] + ", " + coords[1]);

        System.out.println("\n--- Тестування Cellular ---");
        myPhone.makeCall();
        myPhone.receiveCall();
    }
}