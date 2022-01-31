package day43_Abstractions.car;

public final class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Audi start");
    }
}
