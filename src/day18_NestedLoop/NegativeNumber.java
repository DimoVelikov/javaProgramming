package day18_NestedLoop;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();
        int sum =0;

        while (num>=0){
            sum = sum + num;
            System.out.println("Enter number:");
            num = scan.nextInt();


        }
        System.out.println("the sum of the numbers is: " + sum);

    }
}

/*
 Write a program that calculates the sum of numbers entered by the
 user until user enters a negative number.
 */