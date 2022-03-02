package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {



        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println(employeeMap);

        //  1. Update the "M" to Male and "F" to Female

        for (String eachKey : employeeMap.keySet()) {

            if(employeeMap.get(eachKey).equals("F")){
                employeeMap.replace(eachKey,"Female");
            }
            if(employeeMap.get(eachKey).equals("M")){
                employeeMap.replace(eachKey,"Male");
            }

        }

        System.out.println(employeeMap);

        System.out.println("-------------------------");
        /*

        for (Map.Entry<String, String> eachEntrySet : employeeMap.entrySet()) {

            if(eachEntrySet.getValue().equals("M")){
                eachEntrySet.setValue("Male");
            }

            if(eachEntrySet.getValue().equals("F")){
                eachEntrySet.setValue("Female");
            }

        }


         */

        //  2. Display the names of all female employees

        for (String eachKey : employeeMap.keySet()) {

            if(employeeMap.get(eachKey).equalsIgnoreCase("female")){
                System.out.println(eachKey);
            }
        }

        System.out.println("---------------------------------------");

        for (Map.Entry<String, String> eachSet : employeeMap.entrySet()) {

            if(eachSet.getValue().equals("Female")){
                System.out.print(eachSet.getKey()+" ");
            }

        }




    }

}
