package day04_Variables;
/*
Create a class named Rectangle, write a program that can
calculate the area & perimeter of any given Rectangle
 */

public class Rectangle {

    public static void main(String[] args) {
        //length
        //width
        //area = length * width
        // perimeter =  2 * (length + width)

        int  length = 5;
        int width = 12;
        int area = length * width;
        int perimeter = 2 * ( length + width);

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
