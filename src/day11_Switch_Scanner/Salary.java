package day11_Switch_Scanner;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter salary:");
        double salary = scan.nextDouble();
        System.out.println("Married : Yes/No");
        String married = scan.next();
        boolean isMarried = married=="Yes";
        double taxRate = 0;


        if(salary>=130000){
            taxRate = 0.35;
        }else if(salary<=13000 && salary>=75000){
            taxRate=0.30;
        }else{
            taxRate=0.25;
        }

        if(isMarried) taxRate = taxRate-0.05;

        double salaryAfterTax = salary -(salary*taxRate);

        System.out.println(salaryAfterTax);
    }
}
