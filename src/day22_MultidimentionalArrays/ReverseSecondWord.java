package day22_MultidimentionalArrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String [] words = sentence.split(" ");

        String reverse ="";

        for (int i = words[1].length()-1; i >=0 ; i--) {

            reverse += ""+ words[1].charAt(i);

        }


        sentence = sentence.replaceFirst(words[1],reverse);








        System.out.println(sentence);







    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */
