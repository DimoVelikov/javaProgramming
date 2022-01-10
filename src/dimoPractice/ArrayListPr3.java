package dimoPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPr3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list);

        System.out.println("--------------");

        list.add(0,0);

        System.out.println(list);




    }
}
