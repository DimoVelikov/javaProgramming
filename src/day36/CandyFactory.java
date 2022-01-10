package day36;

import java.util.ArrayList;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candy> list = new ArrayList<>();
        list.add(new Candy("Kitkat",1,5,false));
        list.add(new Candy("Snickers",1,5,false));
        list.add(new Candy("MAX",1,5,true));


        for (Candy each : list) {

            System.out.println(each.getBrand()+" "+ each.getPrice());

        }


    }
}
