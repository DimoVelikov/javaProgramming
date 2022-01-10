package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class UniqueElements {
    public static void main(String[] args) {
        
        
        
    }
    
    public static int[] uniqueElement(int[] arr){
        int[] result = {};

        for (int each : arr) {
            
            if(ArraysUtility.frequencyOfElement(arr,each)==1   ){
                result = ArraysUtility.addElement(result,each);
            }
            
        }
        
        
        
        return result;
        
    }

    public static double[] uniqueElement(double[] arr){
        double[] result = {};

        for (double each : arr) {

            if(ArraysUtility.frequencyOfElement(arr,each)==1   ){
                result = ArraysUtility.addElement(result,each);
            }

        }



        return result;

    }

    public static char[] uniqueElement(char[] arr){
        char[] result = {};

        for (char each : arr) {

            if(ArraysUtility.frequencyOfElement(arr,each)==1   ){
                result = ArraysUtility.addElement(result,each);
            }

        }



        return result;

    }

    public static String[] uniqueElement(String[] arr){
        String[] result = {};

        for (String each : arr) {

            if(ArraysUtility.frequencyOfElement(arr,each)==1   ){
                result = ArraysUtility.addElement(result,each);
            }

        }



        return result;

    }
    
    
    
}
