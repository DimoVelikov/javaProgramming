package dimoPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertMoreThanOneElementInArrayListIndex {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));
                           //index 0,1,2,3,4

        System.out.println(list);

        System.out.println("---------------------");

        list.add(1,7);

        System.out.println(list);
        //     [1, 7, 2, 3, 4, 5]
        //index 0, 1, 2, 3, 4, 5

        System.out.println("------------");



        ArrayList<Integer> multipleElements = new ArrayList<>();

        multipleElements.addAll(Arrays.asList(8,8,8,8));

        list.addAll(2, multipleElements);

        System.out.println(list);





    }
}


// Insert more than one element at a particular position of an ArrayList


