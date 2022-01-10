package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCount {
    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer element : scores) {

            if (element>=90 && element<=100){
                gradeOfA.add(element);
            }
            if (element>=80 && element<=89){
                gradeOfB.add(element);
            }
            if (element>=70 && element<=79){
                gradeOfC.add(element);
            }
            if (element>=60 && element<=69){
                gradeOfD.add(element);
            }
            if (element>=0 && element<=59){
                gradeOfF.add(element);
            }

        }

        System.out.println(gradeOfA.size());
        System.out.println(gradeOfB.size());
        System.out.println(gradeOfC.size());
        System.out.println(gradeOfD.size());
        System.out.println(gradeOfF.size());





    }
}

/*

Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */
