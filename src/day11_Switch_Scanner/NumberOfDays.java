package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberOfDays {
    static int month;
    static  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the month: 1-12");
        month = scan.nextInt();
    }
    public static void main(String[] args) {

        switch (month){
            case 2:
                System.out.println("28 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }



    }
}
