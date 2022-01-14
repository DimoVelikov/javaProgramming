package day39_OOPrecap.ShapesTask;

public class Circle extends Shape {
    private double r;
    private static double pi;
    static {
        pi=3.14;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r<=0){
            System.err.println("Invalid radius: " +r);
            System.exit(1);
        }
        this.r = r;
    }

    public Circle(double r) {
        super("Circle");
        setR(r);
    }

    @Override
    public double area() {
        return r*r*pi;
    }

    @Override
    public double perimeter() {
        return 2*r*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name=" + getName() +
                ", r=" + r +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
