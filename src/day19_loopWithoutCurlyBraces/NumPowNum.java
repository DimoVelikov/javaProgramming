package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class NumPowNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = scan.nextInt();
        System.out.println("Enter second number:");
        int n2 = scan.nextInt();

        int sum = 1;

        for (int i = 0; i < n2; i++) {
            sum *= n1;

        }

        System.out.println(sum);

    }
}

/*
Two numbers are entered through the keyboard. Write a program to
find the value of one number raised to the power of another.
 */
