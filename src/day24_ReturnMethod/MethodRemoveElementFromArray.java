package day24_ReturnMethod;

import java.util.Arrays;

public class MethodRemoveElementFromArray {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
        int index = 2;

        int[] result = removeElement(arr,index);

        System.out.println(Arrays.toString(result));



    }

    public static int[] removeElement(int[] arr, int index){

        if(index<0||index> arr.length-1) {
            System.err.println("Invalid Index:" + index);
        }

        int[] result = new int[arr.length-1];
        int i1 = 0;


        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            result[i1++]= arr[i];


        }








        return result;



    }


}
