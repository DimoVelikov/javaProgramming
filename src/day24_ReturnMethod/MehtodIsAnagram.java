package day24_ReturnMethod;

import java.util.Arrays;

public class MehtodIsAnagram {
    public static void main(String[] args) {

        String str1 = "cba";
        String str2 = "bac";

        boolean result = isAnagram(str1, str2);

        System.out.println(result);


    }

    public static boolean isAnagram(String str1, String str2) {
        boolean result = false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            result = true;
        }

        return result;


    }
}
