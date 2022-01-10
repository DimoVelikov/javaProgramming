package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class Fruction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int sum = 1;


        for (int i = num; i > 0; i--) {
            sum *=i;

        }









        System.out.println(sum);

    }
}

/*
Write a program to find the factorial value of any number entered through the keyboard.
 */
