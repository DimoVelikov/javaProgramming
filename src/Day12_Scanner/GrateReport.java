package Day12_Scanner;

import java.util.Scanner;

public class GrateReport {
    static char score;
    static {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        score = scan.next().toUpperCase().charAt(0);
        scan.close();
    }
    public static void main(String[] args) {

        String result = "";

        switch (score){
            case 'A':
                result = "excellent";
                break;
            case 'B':
                result = "very good";
                break;
            case 'C':
                result = "good";
                break;
            case 'D':
                result = "passed";
                break;
            case 'F':
                result = "failed";
                break;
            default:
                result="invalid input";
                break;

        }
        System.out.println(result.toUpperCase().charAt(0)+ result.substring(1));




    }
}

/*
GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */