package day18_NestedLoop;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("Enter a number:");
            int num1 = scan.nextInt();

            if(num1%2==0){
                System.out.println("Number is even");
            }
            if(!(num1% 2 ==0)){
                System.out.println("Number is odd");

            }

            System.out.println("Would you like to continue?");
            String a = scan.next();

            while (!(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
                System.err.println("Invalid input, please re-enter:");
                a = scan.next();
            }


            if(a.equalsIgnoreCase("no")){
                break;
            }
        }








    }
}

/*
Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"
        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
 */