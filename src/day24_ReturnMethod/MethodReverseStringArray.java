package day24_ReturnMethod;

import java.util.Arrays;

public class MethodReverseStringArray {
    public static void main(String[] args) {

        String[] words = {"Dimo","is","the","best","in","Java"};

        String[] reverse = reverseStringArray(words);

        System.out.println(Arrays.toString(reverse));



    }

    public static String[] reverseStringArray(String[] words){
        String[] reverse = new String[words.length];

        for (int i = 0; i < reverse.length; i++) {

            reverse[i] = words[words.length-1-i];

        }

        return reverse;

    }
}
