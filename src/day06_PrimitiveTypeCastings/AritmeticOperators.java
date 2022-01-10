package day06_PrimitiveTypeCastings;

public class AritmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); //13 concatenation
        System.out.println(10 + 20); //30 add
        System.out.println(100 - 50); // 50 substation
        System.out.println(10 * 6); // 60 multiply
        System.out.println(100d / 3); // 33
        System.out.println(10 / 4); //2
        System.out.println(10d/4 );
        System.out.println(10d * 4d);

        int a = 100;
        double b = a/6; // 16.0
        System.out.println(b);

        double c = (double)a /6; // 16.66666

        System.out.println(c);



    }
}
/*
+: addition
-: subtraction
*: multiply
/: division
        in math: 10/4 = 2.5
        in Java 10/4 = 2 for int
        10.0/4 = 2.5 for double
        10d - d stand for decimal
%: modulus
 */