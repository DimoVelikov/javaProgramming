package dimoPractice.interviewQuestions;

public class PrimeNumbers {


    public static void PrimeNumber(int x) {

        //What are the prime numbers from 1 to 100? The prime numbers from 1 to 100 are:
        // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        // In order the number to be prime need to be divisible by itself
        // and one only (num%num==0 && num%1==0)

        //1. Sense 1 and all negatives numbers are not prime numbers
        //we will create and if statement to check this condition
        //2. Sense 2 is a prime number we will create a else if statement
        //with condition if the number is 2 to return message that the number is prime
        //3. If the number does not meet any of the first conditions will go to the else block
        // where loop will be created to check if the number is divisible to any other numbers
        // smaller of itself
        //4. We will use a boolean with default value true that will change
        // to false if the number is not prime
        //5. We will check if the boolean is true and if so we will print that the number is Prime
        // and if not true we will print that the number is not prime

        boolean result = true;

        if (x < 0 || x == 1) {
            result = false;
        } else if (x == 2) {
            result = true;
        }else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    result = false;
                    break;
                }
            }
        }

        if(result){
            System.out.println(x+ " is Prime Number");
        }else {
            System.out.println(x+ " is not a Prime Number");
        }


    }


    public static void main(String[] args) {

        PrimeNumber(-1);


    }
}
