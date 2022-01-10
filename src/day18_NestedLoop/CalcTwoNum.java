package day18_NestedLoop;

import java.util.Scanner;

public class CalcTwoNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.println("Enter first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter operator:");
            char op = scan.next().charAt(0);

            while (!(op == '+' || op == '-' || op == '/' || op == '*')) {
                System.err.println("Invalid input. Please re-enter");
                System.out.println("Enter operator:");
                op = scan.next().charAt(0);

            }

            System.out.println("Enter second number:");
            int num2 = scan.nextInt();

            switch (op) {
                case '+':
                    System.out.println("Result is: " +(num1 + num2));
                    break;
                case '-':
                    System.out.println("Result is: " + (num1 - num2));
                    break;
                case '/':
                    System.out.println("Result is: " +(num1 / num2));
                    break;
                case '*':
                    System.out.println("Result is: " +(num1 * num2));
                    break;
            }
            System.out.println("Would you like to continue?");
            String a = scan.next();

            if (a.equalsIgnoreCase("no")) {
                break;
            }
        }




    }
}

/*
Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until
				user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until
				user provides a valid entry

 */