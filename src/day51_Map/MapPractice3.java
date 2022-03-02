package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        /*
        2. Wirte a program that can return the freuqency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
         */


        String str = "bbcccaaaaa";

        String[] arr = str.split("");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : arr) {

            map.put(each, Collections.frequency(Arrays.asList(arr), each));

        }

        System.out.println(map);


    }
}
