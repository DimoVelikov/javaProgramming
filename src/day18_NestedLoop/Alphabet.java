package day18_NestedLoop;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result =0;


        for (int i = n-1; i >=1 ; i--) {

            result = (long)(n= n*i);


        }

        System.out.println(n);

        int x= 2004189184;

        long y = (long)x;

        System.out.println("----------------");


        System.out.println(y);






    }
}
