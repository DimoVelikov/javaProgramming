package day44_Abstaction.breakfast;

public class Zoo{
    public static void main(String[] args) {
        Cat cat1= new Cat("Pussy","puree",'f',18,"medium","white");

        System.out.println(cat1);

        cat1.eat();

        cat1.drink();
    }
}
