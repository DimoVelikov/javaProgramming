package dimoPractice;

public class PrintfPractice {
    public static void main(String[] args) {
        String name ="Dimo";
        int age = 35;
        double money = 450.54;

        System.out.printf("Hello %s!", name);
        System.out.printf("You are %d old", age);
        System.out.printf("You have $%.2f", money);
    }
}
