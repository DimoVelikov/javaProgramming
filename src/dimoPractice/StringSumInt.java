package dimoPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSumInt {

    public static int StringIntSum(String s){

        String[] arr = s.split(" ");

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(arr));

        list.removeIf(p -> !Character.isDigit(p.charAt(0)));

        int sum = 0;

        for (String each : list) {

            sum += Integer.parseInt(each);

        }

        return sum;
    }

    public static void main(String[] args) {

        String s="12 some text 3 7";

        String[] arr = s.split(" ");

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(arr));

        list.removeIf(p -> !Character.isDigit(p.charAt(0)));

        int sum = 0;

        for (String each : list) {

            sum += Integer.parseInt(each);

        }

        System.out.println(StringIntSum("12 some text 3 7"));


















    }
}
