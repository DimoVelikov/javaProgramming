package day11_Switch_Scanner;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String browserName = scan.nextLine();

        String result = (browserName == "chrome" || browserName == "safary" || browserName == "opera" || browserName == "edge") ?
                ((browserName == "chrome") ? "chrome" : (browserName == "safary") ? "safary" : (browserName == "opera") ? "opera"
                        : "edge") : "invalid input";

        System.out.println(result);

    }
}
