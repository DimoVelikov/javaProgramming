package day24_ReturnMethod;

import java.util.Arrays;

public class MethodMergeTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {6,7,8,9,10,11};

        int[] mergeArray = mergeTwoArrays(num1,num2);

        System.out.println(Arrays.toString(mergeArray));



    }

    public static int[] mergeTwoArrays(int[] num1, int[] num2){
        int[] mergeArray = new int[num1.length+ num2.length];

        int index = 0;

        for (int i = 0; i < num1.length; i++) {
            mergeArray[index]= num1[i];
            index++;


        }
        for (int i = 0; i < num2.length; i++) {

            mergeArray[index]= num2[i];
            index++;

        }

        return mergeArray;

    }

}
