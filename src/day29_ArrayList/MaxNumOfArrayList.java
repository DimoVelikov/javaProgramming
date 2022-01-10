package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumOfArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        
        
        int max = list.get(0);

        for (Integer element : list) {
            
            if(element>max){
                max = element;
            }
            
        }

        System.out.println("max = " + max);
        
        
        
        
        
    }
}

/*
Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */
