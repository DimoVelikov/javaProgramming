package day31_Constructors;

public class Pizza {
    public char size;
    public int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost(){

        double totalPrice = 0;



        totalPrice = ((size == 'S')? 10 :(size == 'M')? 12 : 14) + (numberOfCheeseToppings+ numberOfPepperoniToppings)*2;


        return totalPrice;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", Total Price : $" + calcCost();
    }
}
