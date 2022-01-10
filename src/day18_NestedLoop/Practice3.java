package day18_NestedLoop;


import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <word.length() ; j++) {
               while (!(word.indexOf(i)==word.indexOf(j))){

                   if(word.charAt(i)==word.charAt(j)){
                       System.out.println(""+ word.charAt(i)+ word.charAt(j));
                   }

               }

            }

        }




    }
}



/*
     *
    ***
   *****
  *******
 *********
 */


