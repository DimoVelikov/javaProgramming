package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        int num =1;

        list.remove(num); //remove index

        //list.remove(200); // remove object

        System.out.println(list);


        System.out.println(list.size()); // show the size of the array list

        list.clear(); // clear the array list

        System.out.println(list.size());

        System.out.println("--------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =  characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------");

        boolean r2 = characters.contains('A'); // true
        boolean r3 = characters.contains('Z'); // false

        System.out.println(r2);
        System.out.println(r3);


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2= new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);


        boolean r5 = list1.equals(list2);

        System.out.println(r5);

        System.out.println("----------------");



        ArrayList<Integer> n1n2 = new ArrayList<>();

        boolean b6 = n1n2.isEmpty(); // check if the array list is empty

        System.out.println(b6);

        ArrayList<Integer> n2n2 = new ArrayList<>();

        n2n2.addAll(Arrays.asList(1,2,3,4,5)); // add group of elements

        System.out.println(n2n2);









    }
}
