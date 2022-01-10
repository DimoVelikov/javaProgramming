package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class ReplitCountTriple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        for (int i = 0; i < str.length(); i++) {

            char ch1 = str.charAt(i);

            for (int j = 0; j < str.charAt(j); j++) {
                char ch2 = str.charAt(j);

                for (int k = 0; k < str.length(); k++) {
                    char ch3 = str.charAt(k);

                    if(ch1==ch2&& ch1==ch3){
                        count++;

                    }


                }



            }

        }

        System.out.println(count);

    }
}
