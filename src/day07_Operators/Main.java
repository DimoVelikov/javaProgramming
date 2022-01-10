package day07_Operators;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {

        ////DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE. Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
        String subject1 = input.next();
        double grade1 = input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = input.next();
        double grade2 = input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = input.next();
        double grade3 = input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = input.next();
        double grade4 = input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = input.next();
        double grade5 = input.nextDouble();

        // CONTINUE WRITE YOUR CODE BELOW THIS LINE:

        double averageScore = (grade1 + grade2+ grade3 + grade4 + grade5)/5;

        System.out.println(subject1 + " - " + grade1 +",   " +
                subject2 + " - " + grade2 + ",   " +
                subject3 + " - " + grade3 + ",   " +
                subject4 + " - " + grade4 + ",   " +
                subject5 + " - " + grade5 + "\n" +
                "Your average score is: " + averageScore +"\n" +
                "Thank you for using Grader!" + "\n" +
                "Goodbye!");



        /*
        Output:
  Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
  Your average score is: 4.36
  Thank you for using Grader!
  Goodbye!
         */




    }
}