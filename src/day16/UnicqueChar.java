package day16;

public class UnicqueChar {
    public static void main(String[] args) {
        String input = "AABCCD";

        String resul = "";

        for (int i = 0; i < input.length(); i++) {

            String  ch = "" + input.charAt(i);

            if (input.indexOf(ch) == input.lastIndexOf(ch)){

                resul += ch;

            }


        }

        System.out.println(resul);
    }
}
