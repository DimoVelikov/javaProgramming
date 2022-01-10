package day33_Static;

public class Car {

    public String make, model, color;
    public int year,price;

    public static int numberOfWheels;
    static boolean hasBattery,hasSeats;

    public Car(String make, String model, String color, int year, int price,int numberOfWheels,boolean hasBattery,boolean hasSeats) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.numberOfWheels= numberOfWheels;
        this.hasBattery = hasBattery;
        this.hasSeats = hasSeats;
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
