package dimoPractice;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = scan.nextInt();

        if(score<25){
            System.out.println("Your score is: F");
        }else if(score>25 && score< 45){

            System.out.println("Your score is: E");

        }else if(score> 45 && score< 50){

            System.out.println("D");
        }else if(score> 50 && score<60){

            System.out.println("C");
        }else if(score>60 && score<80){
            System.out.println("B");

        }else if(score>80){

            System.out.println("A");


        }



    }
}
/*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */