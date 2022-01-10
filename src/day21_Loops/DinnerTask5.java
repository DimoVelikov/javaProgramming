package day21_Loops;

import java.util.Arrays;

public class DinnerTask5 {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};
        int[] revNum = new int[5];

        for (int i = num.length - 1; i >= 0; i--) {
            revNum[i] = num[num.length-(1+i)];

        }

        System.out.println(Arrays.toString(revNum));


    }
}

/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */
