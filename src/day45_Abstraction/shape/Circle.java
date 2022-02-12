package day45_Abstraction.shape;

public class Circle extends Shape{

    private double radius;
    public final static double pi;

    static {
        pi= 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            throw new RuntimeException("Invalid Radius: "+ radius);
        }

        this.radius = radius;
    }

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", radius="+ radius+
                '}';
    }
}
