package day09_IfElseStatement;

public class MinNumber {

    public static void main(String[] args) {
        int n1 = 100,
                n2 = 200;
        boolean n1isMin = n1<n2;
        boolean n2isMin = n2<n1;
        boolean equal = n1 == n2;

        if(n1isMin){
            System.out.println("Min number is: " + n1);
        }
        if(n2isMin){
            System.out.println("Min number is: " + n2);
        }
        if(equal){
            System.out.println("Numbers are equal");
        }

    }
}

/*
1. Create a class called MinNumber, Write a program that can print the minimum number
between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */