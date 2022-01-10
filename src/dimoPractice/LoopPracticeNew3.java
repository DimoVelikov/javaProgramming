package dimoPractice;

public class LoopPracticeNew3 {
    public static void main(String[] args) {

        String[] numbers = {"2","4","3","-2","3"};
        // Write a program to find the sum of 5 integers.
        // Use for loop. Don't ask for user input.
        // ============= SAMPLE RUN ================
        // Program Starts:
        // Output:
        // Total is: 10

        //***** Your Code here ***/

        String sum = "";


        for(int i = 0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);



    }
}
