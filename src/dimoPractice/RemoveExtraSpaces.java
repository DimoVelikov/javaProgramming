package dimoPractice;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {


        String str = "   Hello world         I       love           Java     ";



        String[] words = str.split(" "); // create array of words

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------");

        String result = "";

        for (String each : words) {

            if(!each.isEmpty()){
                result += each;
            }

        }

        System.out.println(result);






    }
}
