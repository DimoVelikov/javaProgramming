package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //print
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }
    //min and max of array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
    // contain
    public static boolean contains(int[] array, int element) {
        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;
            }


        }


        return result;

    }
    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }


        }


        return result;

    }
    public static boolean contains(String[] array, String element) {
        boolean result = false;

        for (String each : array) {
            if (each.equalsIgnoreCase(element)) {
                result = true;
            }


        }


        return result;

    }
    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }


        }


        return result;

    }
    // adds element
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    //frequency of element 
    public static int frequencyOfElement(int[] array, int element) {

        int count = 0;
        for (int each : array) {

            if (each == element) {
                count++;
            }

        }

        return count;


    }
    public static int frequencyOfElement(double[] array, double element) {

        int count = 0;
        for (double each : array) {

            if (each == element) {
                count++;
            }

        }

        return count;


    }
    public static int frequencyOfElement(char[] array, char element) {

        int count = 0;
        for (char each : array) {

            if (each == element) {
                count++;
            }

        }

        return count;


    }
    public static int frequencyOfElement(String[] array, String element) {

        int count = 0;
        for (String each : array) {

            if (each.equals(element)) {
                count++;
            }

        }

        return count;


    }
    //unique element
    public static int[] uniqueElement(int[] arr) {
        int[] result = {};

        for (int each : arr) {

            if (ArraysUtility.frequencyOfElement(arr, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }


        return result;

    }
    public static double[] uniqueElement(double[] arr) {
        double[] result = {};

        for (double each : arr) {

            if (ArraysUtility.frequencyOfElement(arr, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }


        return result;

    }
    public static char[] uniqueElement(char[] arr) {
        char[] result = {};

        for (char each : arr) {

            if (ArraysUtility.frequencyOfElement(arr, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }


        return result;

    }
    public static String[] uniqueElement(String[] arr) {
        String[] result = {};

        for (String each : arr) {

            if (ArraysUtility.frequencyOfElement(arr, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }


        return result;

    }
    //remove element
    public static int[] removeElement(int[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid Index:" + index);
        }

        int[] result = new int[arr.length - 1];
        int i1 = 0;


        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result[i1++] = arr[i];


        }


        return result;


    }
    public static double[] removeElement(double[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid Index:" + index);
        }

        double[] result = new double[arr.length - 1];
        int i1 = 0;


        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result[i1++] = arr[i];


        }


        return result;


    }
    public static char[] removeElement(char[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid Index:" + index);
        }

        char[] result = new char[arr.length - 1];
        int i1 = 0;


        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result[i1++] = arr[i];


        }


        return result;


    }
    public static String[] removeElement(String[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid Index:" + index);
        }

        String[] result = new String[arr.length - 1];
        int i1 = 0;


        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result[i1++] = arr[i];


        }


        return result;


    }
    //merge
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = addElement(result, each);
        }

        for (int each : arr2) {
            result = addElement(result, each);
        }

        return result;
    }
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};

        for (double each : arr1) {
            result = addElement(result, each);
        }

        for (double each : arr2) {
            result = addElement(result, each);
        }

        return result;
    }
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};

        for (char each : arr1) {
            result = addElement(result, each);
        }

        for (char each : arr2) {
            result = addElement(result, each);
        }

        return result;
    }
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};

        for (String each : arr1) {
            result = addElement(result, each);
        }

        for (String each : arr2) {
            result = addElement(result, each);
        }

        return result;
    }
    //reverse
    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[index] = arr[i];
            index++;

        }

        return reverse;
    }
    public static double[] reverse(double[] arr){
        double[] reverse = new double[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[index] = arr[i];
            index++;

        }

        return reverse;
    }
    public static char[] reverse(char[] arr){
        char[] reverse = new char[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[index] = arr[i];
            index++;

        }

        return reverse;
    }
    public static String[] reverse(String[] arr){
        String[] reverse = new String[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[index] = arr[i];
            index++;

        }

        return reverse;
    }
    //removeDuplicates
    public static int[] removeDuplicate(int[] arr){
        int[] result = {};

        for (int each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
    public static double[] removeDuplicate(double[] arr){
        double[] result = {};

        for (double each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
    public static char[] removeDuplicate(char[] arr){
        char[] result = {};

        for (char each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
    public static String[] removeDuplicate(String[] arr){
        String[] result = {};

        for (String each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }

        }

        return result;
    }
    //replace element of array with giving index with new element
    public static int[] replace(int[] arr, int index, int newElement) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid input");
            System.exit(0);
        }

        arr[index] = newElement;
        return arr;


    }
    public static double[] replace(double[] arr, int index, double newElement) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid input");
            System.exit(0);
        }

        arr[index] = newElement;
        return arr;


    }
    public static char[] replace(char[] arr, int index, char newElement) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid input");
            System.exit(0);
        }

        arr[index] = newElement;
        return arr;


    }
    public static String[] replace(String[] arr, int index, String newElement) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid input");
            System.exit(0);
        }

        arr[index] = newElement;
        return arr;


    }
    //replace all matching old value with new value
    public static int[] replaceAll(int[] arr,int element,int newElement){
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==element){
                arr[i] = newElement;
            }

        }

        return arr;

    }
    public static double[] replaceAll(double[] arr,double element,double newElement){
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==element){
                arr[i] = newElement;
            }

        }

        return arr;

    }
    public static char[] replaceAll(char[] arr,char element,char newElement){
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==element){
                arr[i] = newElement;
            }

        }

        return arr;

    }
    public static String[] replaceAll(String[] arr,String element,String newElement){
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].equals(element)){
                arr[i] = newElement;
            }

        }

        return arr;

    }
    //








}
