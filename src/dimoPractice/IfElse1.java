package dimoPractice;
import java.util.Scanner;
public class IfElse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = scan.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = scan.nextInt();

        if(length== breadth){
            System.out.println("This is square");

        }else {
            System.out.println("This is a rectangle");
        }

    }
}
/*
Take values of length and breadth of a rectangle from user and check if it is square or not.
 */