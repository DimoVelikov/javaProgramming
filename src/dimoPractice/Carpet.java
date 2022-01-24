package dimoPractice;

public class Carpet {

    public double width, length, unitPrice, totalPrice;

    public boolean isPersian;

    Carpet(){
        width=300;
        length=300;
        totalPrice=200;
        isPersian=false;
        unitPrice=0;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        totalPrice = (width+length)*unitPrice +((isPersian)?200:0);
    }
}