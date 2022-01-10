package dimoPractice;

import java.util.Scanner;

public class IfElse6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();



        String msg = (num>0)? "Number is positive" : (num<0)? "Number is negative" : "Number is zero";
        System.out.println(msg);
                //String msg = num > 10 ? "Number is greater than 10" :
        //  num > 5 ? "Number is greater than 5" : "Number is less than equal to 5";

    }
}

/*
Write a Java program to get a number from the user and print whether it is
positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
 */