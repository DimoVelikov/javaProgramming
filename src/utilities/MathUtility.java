package utilities;

public class MathUtility {
    public static int sum(int n1, int n2){
        int result = n1+n2;

        return result;
    }

    public static double sum(double n1, double n2){
        double result = n1+n2;

        return result;
    }

    public static int sub (int n1, int n2){
        int result = n1+n2;

        return result;
    }

    public static double sub (double n1, double n2){
        double result = n1+n2;

        return result;
    }

    public static int multiply (int n1, int n2){
        int result = n1*n2;

        return result;
    }

    public static double multiply (double n1, double n2){
        double result = n1*n2;

        return result;
    }

    public static int dev (int n1, int n2){
        int result = n1/n2;

        return result;
    }

    public static double dev (double n1, double n2){
        double result = n1/n2;

        return result;
    }

    public static boolean isEven (int n1){

        boolean result = false;

        if(n1%2==0){
            result = true;
        }

        return result;

    }

    public static boolean isOdd (int n1){

        boolean result = false;

        if(n1%2!=0){
            result = true;
        }

        return result;

    }

    public static int max(int n1, int n2){
        int max=0;

        if(n1>n2){
            max = n1;
        }else if(n2>n1){
            max = n2;
        }

        return max;
    }

    public static double max(double n1, double n2){
        double max=0;

        if(n1>n2){
            max = n1;
        }else if(n2>n1){
            max = n2;
        }

        return max;
    }

    public static int min(int n1, int n2){
        int min=0;

        if(n1>n2){
            min = n2;
        }else if(n2>n1){
            min = n1;
        }

        return min;
    }

    public static double min(double n1, double n2){
        double min=0;

        if(n1>n2){
            min = n2;
        }else if(n2>n1){
            min = n1;
        }

        return min;
    }

    public static int square(int n1){
        int result = n1*n1;

        return result;
    }

    public static double square(double n1){
        double result = n1*n1;

        return result;
    }

    public static int cube(int n1){
        int result = n1*n1*n1;

        return result;
    }

    public static double cube(double n1){
        double result = n1*n1*n1;

        return result;
    }





    

}
