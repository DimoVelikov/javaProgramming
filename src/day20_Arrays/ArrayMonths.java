package day20_Arrays;

import java.util.Arrays;

public class ArrayMonths {
    public static void main(String[] args) {
        String months[] = {"Jan","Feb","March","April","May","Jun","Jul","Aug","Sep","Nov","Dec"};

        System.out.println(Arrays.toString(months));

        int num = 3;

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }

        System.out.println("--------");

        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);

        }



    }
}
