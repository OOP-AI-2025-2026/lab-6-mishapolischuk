package org.example.task4;

public class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Car) {
            Car other = (Car) o;

            if (this.price < other.price) return 1;
            if (this.price > other.price) return -1;

            if (this.year > other.year) return 1;
            if (this.year < other.year) return -1;

            if (this.horsePower > other.horsePower) return 1;
            if (this.horsePower < other.horsePower) return -1;
        }
        return 0;
    }
}