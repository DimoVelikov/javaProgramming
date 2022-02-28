package day50_Collentions_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set  = new HashSet<>();

        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

       // Integer[] array =set.toArray(new Integer[0]);

        ArrayList<Integer> list = new ArrayList<>(set);

        System.out.println(list);


        System.out.println("------------------");
        List<Character> characters = new Stack<>();

        characters.addAll(Arrays.asList('A','B','C','D'));

        System.out.println(characters);

        ((Stack)characters).pop();

        System.out.println(characters);


        List<String> names = new LinkedList<>();

        names.addAll(Arrays.asList("James","Jimmy","Kathy"," Breanna","Max"));

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);


    }

}
