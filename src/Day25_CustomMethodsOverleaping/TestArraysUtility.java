package Day25_CustomMethodsOverleaping;

import utilities.ArraysUtility;

public class TestArraysUtility {
    public static void main(String[] args) {
        int[] arrInt = {1,2,3,4,5};
        double[] arrDouble = {2.5,4,5.0};
        String[] arrString = {"Java","Dimo","Cool"};
        char[] arrChars = {'a','@','2','D'};

        ArraysUtility.printEach(arrInt);
        System.out.println("-------------------");
        ArraysUtility.printEach(arrDouble);
        System.out.println("-------------------");
        ArraysUtility.printEach(arrString);
        System.out.println("-------------------");
        ArraysUtility.printEach(arrChars);



    }
}
