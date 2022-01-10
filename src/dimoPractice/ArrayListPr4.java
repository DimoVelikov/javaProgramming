package dimoPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPr4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,5,8,1,3,4,5,6,7));

        System.out.println(list.get(1));

        list.set(list.size()-1,8);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        boolean r1 = list.contains(1);

        System.out.println(r1);

        Collections.sort(list);

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(20,30,50,100));


        System.out.println(list2);

        Collections.copy(list,list2);



        System.out.println(list);






    }
}
