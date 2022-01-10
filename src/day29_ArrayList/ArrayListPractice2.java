package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Dimo","Ahmed", "Bobi", "Ali", "David"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);


        System.out.println("------------------");


        String[] names = {"Mery","Monica", "Dimo", "Ivan","Momchil"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.startsWith("M"));


        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

    }
}
