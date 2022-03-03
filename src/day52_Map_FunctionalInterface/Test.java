package day52_Map_FunctionalInterface;

public class Test {
    public static void main(String[] args) {

        //function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEven = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }
        };

        oddOrEven.apply(20);

        //function2: crate a function that can check if a person is eligible to buy alcohol

        MyFirstFunctionalInterface eligible = age -> {

            if(age>=21){
                System.out.println("Person is eligible to buy alcohol");
            }else {
                System.out.println("Person is not eligible to buy alcohol");
            }

        };

        eligible.apply(18);


        //function3: create a function that can display the cube of a number

        MyFirstFunctionalInterface printCube = n -> {

            System.out.println(n*n*n);

        };

        printCube.apply(3);
        
    }
}
