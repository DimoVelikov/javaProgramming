package day35_OOP.encapsulation;

public class Square {

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side<0){
            System.err.println("Side can not be negative");
            System.exit(0);
        }
        this.side = side;
    }

    public Square(int side) {
        setSide(side);
    }

    public int calcArea(){
        return side*side;
    }

    public int calcPerimeter(){
        return 4*side;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {

        Square sq1 = new Square(5);

        System.out.println(sq1);




    }
}
