package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int javaCount=0;
        int pythonCount =0;
        boolean a;

        while (true){

            if(sentence.contains("java")){
                javaCount++;
                sentence = sentence.replaceFirst("java","");
                if(sentence.contains("python")){
                    pythonCount++;
                    sentence= sentence.replaceFirst("python","");

                }
            }else {
                break;
            }

        }


        if(javaCount>=1&&pythonCount>=1){


            System.out.println(a = javaCount==pythonCount);
        }







    }
}
