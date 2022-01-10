package day21_Loops;

public class DinnerTask7 {
    public static void main(String[] args) {

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {4,5,6,7,8};


        for (int j = 0; j < num1.length; j++) {


            for (int i = 0; i < num2.length; i++) {


                if (num1[j] == num2[i]) {
                    System.out.print( num1[j] +" ");

                }

            }

        }






    }
}

/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */
