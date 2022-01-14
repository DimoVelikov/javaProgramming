package day39_OOPrecap.ShapesTask;

public class Rectangle extends Shape {
    private double width, length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if(width<=0){
            System.err.println("Invalid Width: "+ width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid Length: "+ length);
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name=" + getName() +
                ", width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
