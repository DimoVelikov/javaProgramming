package day33_Static;

public class Test {
    public static void main(String[] args) {
        Address address1 = new Address("8777 Kanawha Ct", "Lorton", "VA", 22079);
        System.out.println(address1);


        System.out.println("----------------");

        System.out.println(Car.hasBattery);
        System.out.println(Car.hasSeats);
        System.out.println(Car.numberOfWheels);

        Car car1 = new Car("Kia","Sorento","white",2017,30000,4,true,true);


       


        System.out.println(car1);
        System.out.println(Car.hasBattery);
        System.out.println(Car.hasSeats);
        System.out.println(Car.numberOfWheels);

        System.out.println("Car.hasBattery = " + Car.hasBattery);
        System.out.println("Car.hasSeats = " + Car.hasSeats);
        System.out.println("Car.numberOfWheels = " + Car.numberOfWheels);



    }


}
