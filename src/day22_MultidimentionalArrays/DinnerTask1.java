package day22_MultidimentionalArrays;

import java.util.Arrays;

public class DinnerTask1 {
    public static void main(String[] args) {

        int[] num = {3,5,6,8,1};

        Arrays.sort(num);

        int[] numReverse = new int[num.length];

        for (int i = 0,j=1; i < num.length; i++,j++) {

            numReverse[i] = num[num.length-j];

        }

        System.out.println(Arrays.toString(numReverse));







    }
}
