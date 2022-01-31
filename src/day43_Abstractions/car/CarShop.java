package day43_Abstractions.car;

public class CarShop {

    public static void main(String[] args) {
        Honda honda = new Honda("accord","gray",2014,5000);
        Audi audi = new Audi("Q7","Black",2020,30000);
        Tesla tesla = new Tesla("Model3","White",2022,70000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }




}
