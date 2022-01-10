package day19_loopWithoutCurlyBraces;

import java.util.Scanner;

public class ReplitHiCount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        int count= 0;

        while (true){
            if(str.contains("hi")){
                count++;
                str = str.replaceFirst("hi","");
            }else {
                break;
            }
        }



        System.out.println(count);
    }
}
