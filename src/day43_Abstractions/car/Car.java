package day43_Abstractions.car;

public abstract class Car {

    private String make,model,color;
    private final int year;
    private double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price<=0){
            throw new RuntimeException("Invalid price");
        }

        this.price = price;
    }

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;

        this.year = year;
        this.price = price;
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void stop(){
        System.out.println("Press the break");


    }
}
