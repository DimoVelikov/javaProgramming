package day20_Arrays;

import java.util.Arrays;

public class ArrayLunch {
    public static void main(String[] args) {
        int[] num = new int[100];

        int index = 0;

       // for (int i = 1; i <= 100; i++) {
      //      num[index] = i;
      //      index++;

      //  }
      //  System.out.println(Arrays.toString(num));
      //  System.out.println("-------------------------------");


        int[] num2 = new int[100];


        for (int i = 100; i >=1 ; i--) {

            num2[index]=i;
            index++;

        }

        System.out.println(Arrays.toString(num2));

        System.out.println("-----------------------------");









    }
}
