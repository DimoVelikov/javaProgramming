package day16;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
        String sport = "";

        if(isTall){
            if(isFast){
                sport = "basketball";

            }else if(isFlexible){
                sport = "gymnastic";
            }else {
                sport = "volleyvall";
            }
        }else {
            if(isFast){
                sport ="socer";

            }else {
                sport = "tenis";

            }
        }

        System.out.println(sport);

















    }
}
