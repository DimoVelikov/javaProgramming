package dimoPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPr2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,5,6));

        for (Integer each : list) {
            System.out.println(each);

        }


    }
}
