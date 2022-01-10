package day04_Variables;
/* Write a program that can calculate the area and perimeter of any given square side

 */
public class Square {
    public static void main(String[] args) {
        // area = side * side
        // perimeter = 4 * side
        
        double side = 4.45;
        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        
    }
    
    
}
