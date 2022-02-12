package day45_Abstraction.shape;

public class Cube extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            throw new RuntimeException("Invalid input");
        }
        this.side = side;
    }


    public Cube(double side) {
        super("Cube");
        this.side = side;
    }



    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }


    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                " side=" + side +
                '}';
    }
}
