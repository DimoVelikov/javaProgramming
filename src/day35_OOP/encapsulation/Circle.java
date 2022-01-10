package day35_OOP.encapsulation;

public class Circle {

    private double radius;

    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid radius input");
            System.exit(0);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }


    public double calcArea(){

        return pi*radius*radius;

    }

    public double calcPerimeter(){

        return 2*pi*radius;


    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }


    public static void main(String[] args) {

        Circle circle = new Circle(2.5);

        System.out.println(circle);



    }

}


