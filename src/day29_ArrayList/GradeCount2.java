package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCount2 {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100
        gradeOfA.removeIf(p -> p<90);
        System.out.println(gradeOfA);


        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf(p -> p<80);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf(p -> p<70);


        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf(p -> p<70);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59

        gradeOfF.removeIf(p -> p < 60);

        System.out.println("gradeOfA = " + gradeOfA.size());
        System.out.println("gradeOfB = " + gradeOfB.size());
        System.out.println("gradeOfC = " + gradeOfC.size());
        System.out.println("gradeOfD = " + gradeOfD.size());
        System.out.println("gradeOfF = " + gradeOfF.size());









    }
}
