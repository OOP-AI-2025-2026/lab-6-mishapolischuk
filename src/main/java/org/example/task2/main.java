package org.example.task2;

public class main {
    public static void main(String[] args) {
        Movable point = new Point(10, 20);

        System.out.println("Початкові координати:");
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());

        point.moveTo(50, 60);

        System.out.println("Нові координати після переміщення:");
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());
    }
}