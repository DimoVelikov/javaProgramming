package day31_Constructors;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;


    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        return (width*length)*unitPrice + ((isPersian)? 200 :0);

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost= $" + calcCost() +
                '}';
    }
}
