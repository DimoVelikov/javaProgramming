package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);


        System.out.println("-----------");



        ArrayList<Integer> list  = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size = list.size();

        list.removeAll(Arrays.asList(0));

        System.out.println(list);

        int newSize = list.size();

        int zeroRemoved = size-newSize;

        System.out.println(zeroRemoved);

        for (int i = 0; i < zeroRemoved; i++) {
            list.add(0);


        }

        System.out.println(list);

        System.out.println("-----------------");


        ArrayList<Integer> list2  = new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(each!=0){
                result.add(each);
            }

        }

        for (Integer each : list) {
            if(each==0){
                result.add(each);
            }

        }

        System.out.println(result);

        System.out.println("--------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add( str.charAt(i) );
        }

        ArrayList<Character> letters = new ArrayList<>( chars ); // add all the characters

        letters.removeIf( p -> !Character.isLetter(p)  ) ; //remove the characters that are not letters

        System.out.println("letters = " + letters);


        ArrayList<Character> digits = new ArrayList<>( chars ); // add all the characters
        digits.removeIf( p -> !Character.isDigit(p)); //remove the characters that are not digits

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>( chars);

        specialChar.removeAll( letters );
        specialChar.removeAll( digits );

        System.out.println("specialChar = " + specialChar);

        System.out.println("------------");



        specialChar.removeIf( p ->  Character.isLetterOrDigit(p) );

        System.out.println("specialChar = " + specialChar);







    }
}
