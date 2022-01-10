package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperators {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7)); // add bulk elements


        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8)); // remove matching bulk elements

        System.out.println(list);

        System.out.println("------------------");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));

        numbers.retainAll(Arrays.asList(100,200,300)); // remain all matching elements

        System.out.println(numbers);


        System.out.println("------------");


        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA","SDET","Dev","QA","SDET","Scrum Master", "BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles );


        System.out.println("----------------------");


        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        
        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------");



        String[] names = {"Dimo","Dimo","Dimo","Dimo"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println(nameList);

        System.out.println("----------------");

        Integer[] arr = {1,2,3,4,5,6,7};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);

        System.out.println("----------");


        int[] arr1 = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr1));

        System.out.println(list3);



        



    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);


        }

        return list;

    }


}
