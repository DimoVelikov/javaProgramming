package day24_ReturnMethod;

public class Method1 {
    public static void main(String[] args) {
        String str = "cccceddddtmmm";

        String result = doublicated(str);
        System.out.println(result);


    }

    public static String doublicated(String str) {
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!(result.contains("" + ch))) {
                result += ch;

            }




        }
        return result;

    }
}





/*
1. create a method that can remove duplicated
characters from a string and returns the new value
 */
