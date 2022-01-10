package dimoPractice;

import java.util.Arrays;
import java.util.Scanner;

public class REplit {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */

        String[] arr  = s.split(":");

        if(arr[2].contains("PM")&& !arr[0].contains("12")){

            int hour = Integer.parseInt(arr[0]) + 12;
            arr[0] = ""+ hour;

        }else if(arr[2].contains("AM")&& arr[0].contains("12")){

            arr[0] = "00";
        }


        System.out.println(arr[0]+":"+arr[1]+":"+ arr[2].substring(0,2));



    }

    public static int[] do_switch(int[] i) {
        // your codes here:

        int[] arr = Arrays.copyOf(i,i.length);



        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return arr;


    }

}



