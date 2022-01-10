package day11_Switch_Scanner;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number between 0-9:");
        int number = scan.nextInt();

        String result = (number >= 0 && number <= 9) ?
                (number == 0) ? "zero" : (number == 1) ? "one" : (number == 2) ? "two" : (number == 3) ?
                        "three" : (number == 4) ? "four" : (number == 5) ? "five" : (number == 6) ? "six"
                        : (number == 7) ? "seven" : (number == 8) ? "eight" : "nine"
                : "invalid input";

        System.out.println(result);

    }
}
