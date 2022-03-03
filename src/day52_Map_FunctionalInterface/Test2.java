package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach = p -> {

            for (int i = 0; i < p.length(); i++) {
                System.out.println(p.charAt(i));
            }
        };

        printEach.test("DIMO");

        MySecondFunctionalInterface<Integer> cube = n -> {

            System.out.println(n*n*n);
        };

        cube.test(3);

    }
}
