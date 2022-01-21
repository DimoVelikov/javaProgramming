package hackerrank;

import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {


    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "."+ num+"."+ num+"."+ num;

    /*
    [01]?\\d{1,2} matches numbers from 0-199;
    2[0-4]\\d     matches numbers from 200-249;
    25[0-5]       matches numbers from 250-255;

     */



}