package day08_IfStatements;
import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();


        boolean has28Days = number ==2;
        boolean has30Days = number == 4 || number ==6 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;

        String numberOfDays = (has28Days)? "the month have 28 days":(has30Days)? "the month have 30 days" : "the month have 31 days" ;

    }
}
/*
Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */