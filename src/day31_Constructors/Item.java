package day31_Constructors;

public class Item {
    public String name;
    public double price;
    public double quantity;

    public Item(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcCost(){
        return price * quantity;

    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price= $" + price +
                ", quantity=" + quantity +
                ", total price= $" + calcCost() +
                '}';
    }
}
