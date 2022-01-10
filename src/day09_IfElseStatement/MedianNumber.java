package day09_IfElseStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        boolean aIsMid = a>b && a<c || a<b && a>c;
        boolean bIsMid = b>c && b<a || b<c && b>a;
        boolean cIsMid = c<a && c>b || c<b && c>a;




    }
}
/*
2. Create a class called MedianNumber. write a program that can find

the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */