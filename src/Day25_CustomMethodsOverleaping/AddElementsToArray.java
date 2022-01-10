package Day25_CustomMethodsOverleaping;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        int element = 5;

        int[] result = addInteger(array,element);

        System.out.println(Arrays.toString(result));

        System.out.println("--------------");

        double[] arr2 = {2.2,5,5.6};
        double element2 = 5.5;

        double[] result2 = addDouble(arr2,element2);

        System.out.println(Arrays.toString(result2));


        System.out.println("---------------");



        String[] names = {"Dimo", "Adam West", "Rick and Morty", "Kaval"};
        String name = "Kukumiau";

        String[] result3 = addString(names,name);

        System.out.println(Arrays.toString(result3));

        char[] chars = {'a','B','C'};
        char[] result4 =addChar(chars,'E');

        System.out.println(Arrays.toString(result4));



    }
    public static int[] addInteger(int[] array, int element){
        int[] result = new int[array.length+1];

        int index = 0;

        for (int each : array) {
            result[index++] = each;


        }
        result[index] = element;

        return result;

    }

    public static double[] addDouble(double[] array, double element){
        double[] result = new double[array.length+1];

        int index = 0;

        for (double each : array) {
            result[index++] = each;


        }
        result[index] = element;

        return result;

    }

    public static String[] addString(String[] array, String element){
        String[] result = new String[array.length+1];

        int index = 0;

        for (String each : array) {
            result[index++] = each;


        }
        result[index] = element;

        return result;

    }

    public static char[] addChar(char[] array, char element){
        char[] result = new char[array.length+1];

        int index = 0;

        for (char each : array) {
            result[index++] = each;


        }
        result[index] = element;

        return result;

    }


}
