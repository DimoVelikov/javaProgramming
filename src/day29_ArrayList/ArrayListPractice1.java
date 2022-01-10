package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countrie = {"Japan","Korea"," United States", "Turkey", "United Kingdom", "Canada"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countrie));

        list.removeIf(p -> p.length()>=10);

        System.out.println(list);


        countrie = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countrie));




        // 1. Create an array pf string called counties
        //2. write a program that can remove all country names that have length of 10 or greater
    }
}
