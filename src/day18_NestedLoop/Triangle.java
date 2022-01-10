package day18_NestedLoop;

public class Triangle {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i+2; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }


    }
}
