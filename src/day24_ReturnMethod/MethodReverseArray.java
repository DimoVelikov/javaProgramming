package day24_ReturnMethod;

import java.util.Arrays;

public class MethodReverseArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        int[] reverse = reverseArray(nums);

        System.out.println(Arrays.toString(reverse));



    }

    public static int[] reverseArray(int[] nums){
        int[] reverse = new int[nums.length];

        for (int i = 0; i < reverse.length; i++) {

            reverse[i] =nums[nums.length-1-i];

        }

        return reverse;


    }
}
