package dimoPractice.interviewQuestions;

public class Q18_ArrayFindMaximum {


    /*

    • Q18: Array -- Find Maximum:
    Write a method that can find the maximum number from an int Array.

     */

    /**
     *
     * I will create a method with return type int and take int array as an argument
     */

    public static int arrayMaxNumber(int[] arr){

        /**
         * i will crete a int variable max and i will assign the first index of the given
         * integer array and i will return max as a result
         */
        int max = arr[0];

        /**
         * i will iterate the given array with for each loop and in the loop i will use and
         * if statment to check if any of the values in the integer array is bigger than my max
         * if that is true the max will take that value
         */
        for (int each : arr) {

            if(each>max){
                max = each;
            }

        }

        return max;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arrayMaxNumber(arr));
    }


}
