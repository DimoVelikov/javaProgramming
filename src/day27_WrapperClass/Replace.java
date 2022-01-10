package day27_WrapperClass;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[] arr ={10,10,20,30,40,30,30,30};

        arr = replaceAll(arr,30,300);

        System.out.println(Arrays.toString(arr));


    }

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

    
}
