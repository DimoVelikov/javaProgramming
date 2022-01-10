package dimoPractice;

import java.util.Scanner;

public class LoopP1 {
    public static void main(String[] args) {

        final int PIN = 07041; //3617

        Scanner scan = new Scanner(System.in);



        for(int i=0; i<3; i++){
            System.out.println("Please enter pin:");
            int pinEntered = scan.nextInt();
            if(pinEntered == PIN){
                System.out.println("Correct, welcome back.");
            }else if(PIN != pinEntered){
                System.out.println("Incorrect, try again.");

            }

        }

    }
}

   // final int PIN = 07041;
// You have to design the code such that the user has only three tries to guess the correct pin of the account.
// You set the pin as a constant with a final attribute.
// When correct display “Correct, welcome back.” When incorrect display “Incorrect, try again.”.
// When ran out of tries display “Sorry but you have been locked out.”
// ============= SAMPLE RUN ================
// Program Starts:
// Please enter pin:
// 22132
// Output:
// Incorrect, try again.
// Please enter pin:
// 23412
// Output:
// Incorrect, try again.
// Please enter pin:
// 07041
// Output:
// Correct, welcome back.

// Program Starts:
// Please enter pin:
// 22132
// Output:
// Incorrect, try again.
// Please enter pin:
// 23412
// Output:
// Incorrect, try again.
// Please enter pin:
// 00000
// Output:
// Sorry but you have been locked out.

//***** Your Code here ***/