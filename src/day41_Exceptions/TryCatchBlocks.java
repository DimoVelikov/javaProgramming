package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {


        System.out.println("Test started");

        try {
            System.out.println(9 / 0);
            System.out.println("Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("ArithmeticException was catch");

        }

        System.out.println("Test completed");

        System.out.println("---------------");

        System.out.println("Test 2 started");
        int[] num = {1, 2, 3};

        try {
            System.out.println("Try Block");
            System.out.println(num[200]);
        } catch (RuntimeException e) {
            System.out.println("Catch Block");
            e.printStackTrace();
            //   System.err.println(e.getMessage());
        }

        System.out.println("Test 2 completed");


        System.out.println("----------");




        System.out.println("Test 3 started");



        try {
            System.out.println("Try Block");
            System.out.println("Cydeo".substring(2, 0));

        } catch (RuntimeException e) {
            System.out.println("Catch Block");

            e.printStackTrace();
        }

        System.out.println("Test 3 completed");



    }
}
