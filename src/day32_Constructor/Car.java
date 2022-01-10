package day32_Constructor;

public class Car {

    public String make,model,color;
    public int year, price;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make,model);
        this.year = year;
    }

    public Car(String make, String model, int year, int price) {
        this(make,model,year);
        this.price = price;
    }

    public Car(String make, String model, String color, int year, int price) {
        this(make, model, year, price);
        this.color = color;

    }


}
