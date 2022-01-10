package day26_CustomMethodPractice;

public class RemoveElements {
    public static void main(String[] args) {


    }

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

    public static char[] removeElement(char[] arr, int index){

        if(index<0||index> arr.length-1) {
            System.err.println("Invalid Index:" + index);
        }

        char[] result = new char[arr.length-1];
        int i1 = 0;


        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            result[i1++]= arr[i];


        }








        return result;



    }

    public static String[] removeElement(String[] arr, int index){

        if(index<0||index> arr.length-1) {
            System.err.println("Invalid Index:" + index);
        }

        String[] result = new String[arr.length-1];
        int i1 = 0;


        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            result[i1++]= arr[i];


        }








        return result;



    }

}


