package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);


        //    1.1 who has the maximum salary?
        //    1.2 who has the minimum salary?

        int maxSalary = Integer.MIN_VALUE;
        int minSalary  = Integer.MAX_VALUE;
        String name1 = "";
        String name2 = "";

        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {

            if(eachPair.getValue()>maxSalary){
                maxSalary= eachPair.getValue();
                name1 = eachPair.getKey();
            }

            if(eachPair.getValue()<minSalary){
                minSalary = eachPair.getValue();
                name2 = eachPair.getKey();
            }


        }

        System.out.println("maxSalary = " + maxSalary);
        System.out.println("name1 = " + name1);
        System.out.println("minSalary = " + minSalary);
        System.out.println("name2 = " + name2);


        //    1.3 how many employees has the salary between 120k ~ 150K?

        int count =0;

        for (Integer eachSalary : map.values()) {

            if(eachSalary>=120000&&eachSalary<=150000){
                count++;
            }

        }

        System.out.println(count);


        //    1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {

            if(eachPair.getValue()<118000){
                System.out.print(eachPair.getKey()+ " ");
            }

        }

        //    1.5 increase the salary of each employee by 1

        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {

            eachPair.setValue(eachPair.getValue()+1);

        }

        System.out.println(map);


    }
}
