package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1= scan.nextInt();
        System.out.println("Enter operator: " );
        char op = scan.next().charAt(0);

        if(!(op=='+'||op=='-')){
            System.err.println("Invalid math operator: "+ op);
            System.exit(0);
        }


        System.out.println("Enter second number");
        int num2 = scan.nextInt();



    }
}
