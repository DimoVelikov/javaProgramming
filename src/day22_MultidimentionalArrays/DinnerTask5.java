package day22_MultidimentionalArrays;

import java.util.Arrays;

public class DinnerTask5 {
    public static void main(String[] args) {

        int[] num1 = {30, 10, 20};
        int[] num2 = {15, 40, 25, 35};
        int[] num3 ={8, 9, 17, 5, 4, 1};

        int[] mergeNum = new int[num1.length+num2.length+num3.length];


        int index =0;

        for (int each: num1){
            mergeNum[index] = each;
            index++;

        }
        for (int each: num2){
            mergeNum[index] = each;
            index++;

        }

        for (int each: num3){
            mergeNum[index] = each;
            index++;

        }

        System.out.println(Arrays.toString(mergeNum));




    }
}

/*
Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */