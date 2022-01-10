package day21_Loops;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";


        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));


        for (char each : str.toCharArray() ){

            System.out.println(each);

        }


        System.out.println("----------------");

        String abc = "I love learning java programing language";

        String word[] = abc.split(" ");

        System.out.println(Arrays.toString(word));




    }
}
