package day24_ReturnMethod;

public class MethodReverseString {
    public static void main(String[] args) {

        String str = "Level";

        String result = reverseString(str);

        System.out.println(result);

        boolean isPalindrome = isPalindrome(str,result);
        System.out.println(isPalindrome);



    }

    public static String reverseString(String str){

        String result = "";

        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {

            result += ch[i];

        }

        return result;


    }

    public static boolean isPalindrome(String str, String result){
        boolean isPalindrome = false;
        if(str.equalsIgnoreCase(result)){
            isPalindrome = true;
        }

        return isPalindrome;

    }

}
