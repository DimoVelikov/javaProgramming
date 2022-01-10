package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number one:");
        int num1 = scan.nextInt();
        System.out.println("Enter number two");
        int num2 = scan.nextInt();

        System.out.println("Addition: "+ (num1+num2));

        System.out.println("Would you like to continue?");


        String answer = scan.next();

        while (true){

            System.out.println("Enter number one:");
            num1 = scan.nextInt();
            System.out.println("Enter number two");
            num2 = scan.nextInt();

            System.out.println("Addition: "+ (num1+num2));

            System.out.println("Would you like to continue?");


            answer = scan.next();

            while ( !(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("yes"))  ){
                System.err.println("Invalid Entry, Please re-enter");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("no")){
                break;
            }

        }





    }
}
