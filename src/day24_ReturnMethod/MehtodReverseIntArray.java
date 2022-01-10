package day24_ReturnMethod;

import java.util.Arrays;

public class MehtodReverseIntArray {
    public static void main(String[] args) {

        int[] arr  = {1,2,3,4,5};

        int[] result = reverse(arr);


        System.out.println(Arrays.toString(result));



    }

    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[index] = arr[i];
            index++;

        }

        return reverse;
    }


}
