package Day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius = scan.nextDouble();
        scan.close();

        double area = radius* radius * 3.14;
        double perimeter = 2* 3.14 * radius;

        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is "+ perimeter);



    }
}


/*
Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */