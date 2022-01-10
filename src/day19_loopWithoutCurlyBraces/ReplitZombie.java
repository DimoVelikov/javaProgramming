package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class ReplitZombie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int i = 0;
        while (inhabitants != 0) {

            System.out.println("Day" + i + " [" + inhabitants + "]");
            inhabitants = inhabitants / 2;
            i++;
        }

        System.out.println("---- EXTINCT ----");


    }
}

/*
Example- inhabitants are 20

Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----
 */
