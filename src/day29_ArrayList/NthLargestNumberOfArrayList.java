package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumberOfArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));


        for (int i = 0; i < 4; i++) {

            list.removeIf(p -> p ==Collections.max(list));



        }
        int max = Collections.max(list);
        System.out.println(max);







        /*


        for (int i = 0; i <4; i++) { //n-1
            int max = list.get(0);


            for (Integer element : list) {

                if (element > max) {
                    max = element;
                }

            }
            list.remove(list.indexOf(max));

        }

        int nMax = Collections.max(list);

        System.out.println(nMax);





         */



    }
}

