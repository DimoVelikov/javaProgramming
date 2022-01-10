package day24_ReturnMethod;

public class DinnerTask5 {
    public static void grade(int score) {
        if (score > 0 && score <= 100) {
            if (score <= 40) {
                System.out.println("F");


            } else if (score <= 60) {
                System.out.println("D");

            } else if (score <= 80) {
                System.out.println("B");

            } else if (score <= 90) {
                System.out.println("A");
            }

        }


    }

    public static void main(String[] args) {
        grade(50);


    }
}





/*
create a method that can calculate the grade of the student based on the score
 */
