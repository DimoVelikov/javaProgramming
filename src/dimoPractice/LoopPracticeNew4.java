package dimoPractice;

public class LoopPracticeNew4 {
    public static void main(String[] args) {
        int number = 7;
        // Write a java program to calculate the factorial value of given number. Factorial x --&gt; x * x-1 * x-2...x*1
        // Example: factorial 4 = 4 * 3 * 2 * 1 = 24
        // ============= SAMPLE RUN ================
        // Program Starts:
        // Output:
        // Factorial of the number is: 5040

        //***** Your Code here ***/

        int sum = 1;
        for(int i= 1; i<=number; i++){
            sum = sum*i;
        }
        System.out.println(sum);



    }
}
