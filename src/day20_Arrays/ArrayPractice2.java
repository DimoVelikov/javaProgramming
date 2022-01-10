package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];


        for (char i = 'A', j=0; i <= 'Z' && j< letters.length; i++,j++) {

            letters[j]= i;


        }

        System.out.println(Arrays.toString(letters));


        System.out.println("---------------------------");


        char[] letters2 = new char[26];

        int index = 0;

        for (char i = 'Z'; i >='A' ; i--) {

            letters2[index]= i;
            index++;

        }

        System.out.println(Arrays.toString(letters2));




        }


    }

