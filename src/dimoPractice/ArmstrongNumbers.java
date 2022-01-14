package dimoPractice;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        /*

        int x = 153;

        int thirdDigit = x % 10;

        int secondDigit = (x / 10) % 10;

        int firstDigit = (x / 100) % 10;

         */





        for (int i = 1; i <= 500; i++) {
            //for single digits check if i power of 1 == i
            if (i < 10) {
                if (i * 1 == i) {
                    System.out.print(i + " ");
                }
            }
            //for double digits check if the sum of each digit on power of 2 == i
            if (i > 10 && i < 100) {
                int firstDigit = (i / 10) % 10;
                int secondDigit = i % 10;
                if ((firstDigit * firstDigit) + (secondDigit * secondDigit) == i) {
                    System.out.print(i + " ");
                }
            }


            //for triple digits check if the sum of each digit on power of 3 ==i

            if (i > 100 && i <= 500) {
                int firstDigit = (i / 100) % 10;
                int secondDigit = (i / 10) % 10;
                int thirdDigit = i % 10;

                if ((firstDigit * firstDigit * firstDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit) == i) {
                    System.out.print(i + " ");
                }


            }


        }


    }

}

/*
17. Write a program to print out all Armstrong numbers between 1 and 500.
If sum of cubes of each digit of the number is
 equal to the number itself, then the number is called an Armstrong number.
 For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
 */
