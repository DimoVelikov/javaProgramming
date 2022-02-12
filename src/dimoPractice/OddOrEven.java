package dimoPractice;

public class OddOrEven {


    public static void oddOrEven(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is Even");
        } else {
            System.out.println(a + " is Odd");
        }
    }



    public static double divide(double a, double b){
        int result =0;




        while (a%b!=0){

            a = a-b;

        }

        return result;

    }



    public static void main(String[] args) {
        OddOrEven.oddOrEven(3);

       // System.out.println(divide(1, 3));

        System.out.println(1.0/3.0);


    }

}