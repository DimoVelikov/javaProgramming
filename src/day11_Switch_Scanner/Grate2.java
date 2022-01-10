package day11_Switch_Scanner;

import java.util.Scanner;

public class Grate2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grate: ");
        char grate = scan.next().toUpperCase().charAt(0);


        switch (grate) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
            default:
                System.out.println("Invalid input");
                break;


        }

        /*String result = (grate == 'A' ||grate == 'B'||grate == 'C'||grate == 'D')?"Passed"
                :(grate== 'F')? "Failed" : "Invalid Input";

        System.out.println(result);


         */

    }
}
