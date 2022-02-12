package dimoPractice;

public class DivideWithoutDivideOperator {

    /*
     declaring a method with public access modifier and static modifier with return type int
     and parameters int a and int b.

     */

    public static int division(int a, int b){

        // using a if statement to check if any of the integers are equal 0

        // if the condition int a is equal to 0 we will return 0 as a result
        if(a==0){
            return 0;
        }

        /*
          if the condition int b is equal to 0 we will return error message and we will
          exit the method
         */
        if(b==0){

            System.err.println("Invalid operation, you can not divide by 0");
            System.exit(0);
        }

        /*
        we will create a boolean negative and passing false value.
        We will use the boolean to determine the end result will it be negative or positive

         */
        boolean isNegative = false;

        // we will check if any of the integers are negative using a nested if statement
        if(a<0 || b<0){

            // we will use a if condition to check if only the first integer is negative and
            // the second int b is positive
            // if that condition is true we will turn the negative int a to a positive and
            // change our boolean value to be true
            if(a<0&&b>0){
                a = -a;
               isNegative = true;
            }

            // we will check if only the second integer int b is negative and
            // the first int a is positive
            // if that condition is true we will turn the negative int b to a positive and
            // change our boolean value to be true
            if(b<0&&a>0){
                b= -b;
                isNegative=true;
            }

            // we will use a if statement to check if both of the integer int a and int b are
            // negative and if they are we will turn them to positive

            if(a<0&&b<0){
                a= -a;
                b = -b;
            }

        }


        // we will create a int value result to store the result and assing 0
        int result = 0;

        /*
         we will use a while loop that will run while int a is greater or equal to b.
         Every time the loop is executed it will subtract int b from int a and assing the result
         to int a, also increment our result value by 1

         */
        while (a>=b){

            a= a-b;
            result++;

        }

        /*
         the if statement below will check if the boolean isNegative is true and if so
         our result will be negative.
        */
        if(isNegative){

            result = -result;
        }


        // we will return the int result

        return result;

    }


    public static void main(String[] args) {

        System.out.println("division result = " + division(10, -5));

    }
}
