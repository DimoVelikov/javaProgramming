package day21_Loops;

import java.util.Arrays;

public class DinnerTask6 {
    public static void main(String[] args) {

        int[] num = {10,0,5,1,0};
        int[] num2 = new int[num.length];
        Arrays.sort(num);


        for (int i = num.length - 1; i >= 0; i--) {


            num2[i] = num[num.length-(1+i)];

        }

        System.out.println(Arrays.toString(num2));

    }
}

/*
 write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */
