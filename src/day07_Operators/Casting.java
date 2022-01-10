package day07_Operators;

public class Casting {

    public static void main(String[] args) {
        float averageSore = 20.5f;
        byte num1  = (byte)averageSore; // explicit casting
        short num2 = (short) averageSore; // explicit casting
        int num3 = (int) averageSore; // explicit casting
        long num4 = (long) averageSore; // explicit casting
        float num5 = averageSore; // no casting
        double num6 = averageSore; // implicit casting

        System.out.println("averageSore = " + averageSore);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }
}
