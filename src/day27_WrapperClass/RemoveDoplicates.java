package day27_WrapperClass;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDoplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4};
        arr = removeDuplicate(arr);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] removeDuplicate(int[] arr){
        int[] result = {};

        for (int each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static double[] removeDuplicate(double[] arr){
        double[] result = {};

        for (double each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static char[] removeDuplicate(char[] arr){
        char[] result = {};

        for (char each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static String[] removeDuplicate(String[] arr){
        String[] result = {};

        for (String each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
}
