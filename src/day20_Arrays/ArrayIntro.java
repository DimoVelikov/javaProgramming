package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        //System.out.println(myGroup); // hashcode //wrong!!

        myGroup[0] ="Gunay";
        myGroup[1]= "Neira";
        myGroup[2]= "Suat";
        myGroup[3]= "Hulya";
        myGroup[4]= "Mikael";

        System.out.println(Arrays.toString(myGroup)); //right method!


        System.out.println("---------------");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int num = 1;
        if(num<1 || num>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[num-1]);







    }
}
