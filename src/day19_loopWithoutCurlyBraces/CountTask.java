package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class CountTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zeroCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num == 0) {
                zeroCount++;

            } else if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }


            System.out.println("Would you like to enter another number: ");
            String a = scan.next();

            while (!(a.equalsIgnoreCase("no")||a.equalsIgnoreCase("yes")) ){
                System.err.println("Invalid entry, please re-enter:");
                System.out.println("Would you like to enter another number: ");
                a = scan.next();
            }


            if (a.equalsIgnoreCase("no")){
                break;
            }


            }

        System.out.println("negativeCount = " + negativeCount);
        System.out.println("positiveCount = " + positiveCount);
        System.out.println("zeroCount = " + zeroCount);

        }
    }



/*
Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered.
 */
