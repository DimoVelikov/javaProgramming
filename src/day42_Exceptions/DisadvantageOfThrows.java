package day42_Exceptions;

public class DisadvantageOfThrows {

    public static void main(String[] args) {
        System.out.println("Hello");

     //   sleep(2.5); // Throws need to imported

        System.out.println("Hello world");

        System.out.println("---------------------");


        MorningWorkOut.sleep(2.5);

        System.out.println("Cydeo");



    }

    public static void sleep(double sec) throws InterruptedException {
        Thread.sleep((long) (sec*1000));
    }

}

