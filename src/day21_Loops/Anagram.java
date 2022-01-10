package day21_Loops;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 ="acbd";
        String str2 = "dbca";

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        System.out.println(Arrays.equals(ch1,ch2));



    }
}
