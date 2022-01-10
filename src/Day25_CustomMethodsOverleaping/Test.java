package Day25_CustomMethodsOverleaping;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programing Launguage";

        StringUtility.printEachChar(str);
        String result = StringUtility.reverse(str);
        System.out.println("--------------");

        System.out.println(result);

        System.out.println("---------------");

        String str1 = "Level";

        boolean result1 = StringUtility.isPalindrome(str1);

        System.out.println(result1);

        System.out.println("---------------");


        String a = "abv";
        String b = "vab";

        System.out.println(StringUtility.anagram(a,b));


        System.out.println("------------------------");

        String strA = "aannnsadnsadkmaksmald";


        String bomba = StringUtility.removeDouplicateChar(strA);

        System.out.println(bomba);


    }
}
