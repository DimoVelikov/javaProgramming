package dimoPractice;

import java.time.LocalDate;
import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mm = scan.nextInt();
        int dd = scan.nextInt();
        int yy = scan.nextInt();
        LocalDate dt = LocalDate.of(yy,mm,dd);
        System.out.println(dt.getDayOfWeek());









    }
}
