package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class ReplitJavaCount {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count = 0;

        while (true){
            if(word.contains("java")){
                count++;
                word = word.replaceFirst("java","");
            }else {
                break;
            }

        }

        System.out.println(count);

    }
}
