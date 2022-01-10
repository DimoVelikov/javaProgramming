package utilities;

import java.util.Arrays;

public class StringUtility {

    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    public static String reverse(String str){
        String reverse =  "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);

        }

        return reverse;
    }

    public static boolean isPalindrome(String str){
       boolean result = reverse(str).equalsIgnoreCase(str);

       return result;
    }

    public static boolean anagram(String str1,String str2){
        boolean result = false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){

            result = true;


        }
        return result;

    }



    public static String removeDouplicateChar(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(!(result.contains(""+ch))){
                result += ch;
            }


        }
        return result;


    }







}
