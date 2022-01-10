package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class ReplitCatsAndDogs {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        while (word.contains("cat") || word.contains("dog")){
                if(word.contains("cat")){
                    countOfCats++;
                    word = word.replaceFirst("cat","");
                }
                if(word.contains("dog")){
                    countOfDogs++;
                    word =word.replaceFirst("dog","");
                }

        }

        if(countOfCats==countOfDogs){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }

}
