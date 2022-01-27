package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        /*

        System.out.println("--------Push up started----------");

        for (int i = 1; i <=30 ; i++) {
            System.out.println("Push up "+ i);

            try {
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

         */

        System.out.println("Pull ups Started");

        for (int i = 1; i < 20; i++) {

            System.out.println("Push up "+ i);

           sleep(20);
        }



    }


    public static void sleep(double sec){

        try {
            Thread.sleep((long) (sec*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


/*
1. Do 30 push-ups and try pausing 1.5 seconds in each
2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */
