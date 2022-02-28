package dimoPractice.interviewQuestions;

public class ArmstrongNumbers {


    // Write a method that can check if a number is Armstrong number

    public static void ArmstrongNumber(int x) {

        // To find if the number is Armstrong number we need to check if the number is equal
        // the sum of each digit on the power of the numbers of the digits
        // example: 153 = (1*1*1)+(5*5*5)+(3*3*3)



        boolean flag = true;

        //for single digits check if x power of 1 == x
        if (x > 0 && x < 10) {
            if (x * 1 == x) {
                flag = true;
            }else {
                flag =false;
            }
        } else if (x > 10 && x < 100) {
            //for double digits check if the sum of each digit on power of 2 == x
            int firstDigit = (x / 10) % 10;
            int secondDigit = x % 10;
            if ((firstDigit * firstDigit) + (secondDigit * secondDigit) == x) {
                flag = true;
            }else {
                flag = false;
            }
        } else if (x > 100 && x <= 1000) {
            //for triple digits check if the sum of each digit on power of 3 == x
            int firstDigit = (x / 100) % 10;
            int secondDigit = (x / 10) % 10;
            int thirdDigit = x % 10;

            if ((firstDigit * firstDigit * firstDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit) == x) {
                flag = true;
            }else {
                flag = false;
            }

        }

        if(flag){
            System.out.println(x+ " is a Armstrong Number");
        }else {
            System.out.println(x+ " is NOT a Armstrong Number");
        }

    }


        public static void main (String[]args){

        ArmstrongNumber(99);

        }
    }





