package day20_Arrays;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] store = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            store[i] = num;


        }

        int min = store[0];

        for (int i = 0; i < store.length; i++) {
            
            if(store[i]<min){
                min = store[i];
            }
            
        }

        System.out.println("min = " + min);
        
        int max = store[0];

        for (int i = 0; i < store.length; i++) {
            
            if(store[i]>max){
                max= store[i];
            }
            
        }

        System.out.println("max = " + max);
        
        
    }
}
