package day45_Abstraction.shape;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            throw new RuntimeException("Invalid input: "+ side);
        }
        this.side = side;
    }



    public Square( double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }


}
