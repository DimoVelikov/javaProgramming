package dimoPractice;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        while(scan.hasNext()){
            count++;
            System.out.println(count + " " + scan.nextLine());
        }
        scan.close();
    }
}
