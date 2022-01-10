package day33_Static;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit {
    //create your method below

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        ArrayList<Integer> restult = new ArrayList<>();

        for (Integer each : nums) {
            restult.add(each*2);

        }

        return restult;

    }








    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
