package day24_ReturnMethod;

public class DinnerTask4 {

    public static void isElegible(int age, boolean usResident){

        if(age>=18 && usResident ){
            System.out.println("You are eligible to vote!");

        }else {
            System.out.println("You are not eligible to vote!");
        }
    }

    public static void main(String[] args) {
        isElegible(21,true);
    }



}
