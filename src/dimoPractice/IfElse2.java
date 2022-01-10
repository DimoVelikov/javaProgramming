package dimoPractice;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int unit = 100;
        double off10 = 0.1;
        System.out.println("Enter quantity: ");
        int quantity = scan.nextInt();
        int price = quantity * unit;
        double saving = (double)price * off10;
        double total = price - saving;


        if(price >= 1000){
            System.out.println("Total Cost is: " + total);
        }else{
            System.out.println(price);
        }

    }
}
/*
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
 */