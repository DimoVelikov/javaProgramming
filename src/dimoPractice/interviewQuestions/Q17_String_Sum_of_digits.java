package dimoPractice.interviewQuestions;

public class Q17_String_Sum_of_digits {

    /*

    Q17: String -- sum of digits in a string:
    Write a method that can return the sum of the digits in a string. “12345” → 15

     */

    /**
     *
     * i will create a method with return type int and take String as an argument
     */

    public static int sumOfDigitsInString(String str){
        /**
         * i will create a int result to contain the result and i will return it on the
         * end of the method
         */
        int result = 0;

        /**
         * i will turn the string to a string array using split method and i will iterate
         * the array using for each loop
         */
        String[] arr = str.split("");

        for (String each : arr) {

            /**
             * in the loop i will use the parseInt method that will turn each string char
             * to a int and i will add them to the result
             */
            result += Integer.parseInt(each);

        }


        return result;
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigitsInString("12345"));
    }
}
