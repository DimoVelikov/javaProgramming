package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] store = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            store[i] = num;


        }

        System.out.println(Arrays.toString(store));

        Arrays.sort(store);
        System.out.println("Minimum number is: "+store[0]);
        System.out.println("Maximum number is: "+ store[store.length-1]);


    }
}
