package day35_OOP.encapsulation;

public class Rectangle {

    private int width, length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width<0){
            System.err.println("With can not be negative");
            System.exit(0);
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length<0){
            System.err.println("length can not be negative");
            System.exit(0);
        }
        this.length = length;
    }

    public Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);
    }

    public int calcArea(){
        return width*length;
    }
    public int calcPerimeter(){
        return 2*(width+length);
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }


    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,8);

        System.out.println(rectangle1);


    }


}
