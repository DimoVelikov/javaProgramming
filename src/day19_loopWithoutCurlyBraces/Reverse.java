package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while(temp>0)
        {
            remainder = temp % 10;//12345%10 = 5 //1234%10= 4 .....
            reverse *= 10 + remainder; //0*10 +5 // 5*10 +4// 54*10 +3 //
            temp /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reverse);



    }
}


/*
Write a program that prompts the user to input an integer
 and then outputs the number with the digits reversed. For example,
  if the input is 12345, the output should be 54321.
 */
