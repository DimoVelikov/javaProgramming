package day19_loopWithoutCurlyBraces;

public class Piramid {
    public static void main(String[] args) {

        // System.out.println("     *"); //5 spaces 1*
        //  System.out.println("   ***");//4 spaces 3*
        // System.out.println("   *****");//3 spaces 5*
        //  System.out.println("  *******"); //2 spaces 7*
        //  System.out.println(" *********"); // 1 spaces 9*

        /*


        for (int i = 5; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("1");

            }



            System.out.println();

        }

         */

        for (int i = 1,i1=5; i <= 9&&i1>=0; i += 2,i1--) {

            for (int j = 0; j < i1; j++) {
                System.out.print(" ");

            }






                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }


        }
    }



/*
     *
    ***
   *****
  *******
 *********
 */
