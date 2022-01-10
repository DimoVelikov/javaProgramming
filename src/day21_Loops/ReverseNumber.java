package day21_Loops;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {

        int[] num = {10,20,30,40};

        int[] reverse = new int[num.length];


        for (int i = num.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j]= num[i];

        }


        System.out.println(Arrays.toString(reverse));



    }
}
