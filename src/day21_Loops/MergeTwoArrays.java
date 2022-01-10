package day21_Loops;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};

        int[] arr2 = {5,6};

        int[] num = new int[arr1.length+arr2.length];

        int index =0;

        for (int num1 : arr1){
            num[index] =num1;
            index++;
        }

        for(int num1 :arr2){
            num[index] = num1;
            index++;
        }

        System.out.println(Arrays.toString(num));





        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));



    }

}

/*
 write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */
