package day33_Static;

public class Circle {

    public double radius, diameter;

    static double pi =3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double calcArea(){
        return radius*radius*pi;
    }

    public double calcPerimeter(){
        return  2*radius*pi;
    }

    public void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +

                '}';
    }
}
