package day24_ReturnMethod;

public class DinnerTask3 {
    public static void isEligible(int age){
        if(age>=21){
            System.out.println("Is eligible");
        }else {
            System.out.println("Is not eligible");
        }

    }

    public static void main(String[] args) {
        isEligible(24);
    }
}
