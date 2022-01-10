package Day25_CustomMethodsOverleaping;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int[] intArray = {5,6,0,-1,3,4};

        double[] doubleArray = {5.0,12,6.5};

        char[]  charsArray = {'A', 'D', 'W','K'};



        sumOfNums(10,20,40,50);









    }

    public static int sumOfNums(int num1, int num2){
        return num1+num2;
    }

    public static double sumOfNums(double num1,double num2){
        return num1+num2;
    }

    public static int sumOfNums(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static int sumOfNums(int num1, int num2, int num3, int num4){
        return num1+num2+num3+ num4;
    }






}
