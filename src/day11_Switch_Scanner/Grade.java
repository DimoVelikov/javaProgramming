package day11_Switch_Scanner;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grate: ");
        char grate = scan.next().toUpperCase().charAt(0);

        switch (grate){
            case 'A' :
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid input");
                break;

        }





    }
}
