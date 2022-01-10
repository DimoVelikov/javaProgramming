package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;
        boolean devBy2 = number % 2 ==0;
        boolean devBy3 = number % 3 ==0;
        boolean devBy5 = number % 5 ==0;
        System.out.println(number + " is divisible by 2: " + devBy2);
        System.out.println(number + " is divisible by 2: " + devBy3);
        System.out.println(number + " is divisible by 2: " + devBy5);

    }
}
