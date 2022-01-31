package day43_Abstractions.car;

public class Tesla extends Car
{
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Tesla start");
    }
}
