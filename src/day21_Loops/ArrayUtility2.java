package day21_Loops;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Kaluf", "Bebin", "David", "Muimuin", "Aishe"};
        String[] earlyBirds = Arrays.copyOf(students,3);


        System.out.println(Arrays.toString(earlyBirds));

        boolean b = Arrays.equals(students,earlyBirds);

        System.out.println("--------------------------------");

        char[] ch1 = {'A', 'B', 'C','D', 'E', 'F', 'G', 'H', 'I'};

        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1);

        System.out.println(Arrays.toString(ch2));


    }
}
