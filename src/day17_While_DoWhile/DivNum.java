package day17_While_DoWhile;

public class DivNum {
    public static void main(String[] args) {
        int n1 = 50;
        int n2 = 5;
        int result = 0;

        if (n1 > 0 && n2 > 0) {

            if (n1 > n2) {
                while ((n1 - n2) > 0 || (n1 - n2) == 0) {
                    result++;
                    n1 = n1 - n2;

                }
            } else if (n2 > n1) {


                while ((n2 - n1) > 0 || (n2 - n1) == 0) {
                    result++;
                    n2 = n2 - n1;

                }
            }

            System.out.println("Result of first number divided by the second one is: "+result);

        } else if (n1 < 0 && n2 < 0) {
            if (n1 < n2) {
                while ((n1 - n2) < 0 || (n1 - n2) == 0) {
                    result++;
                    n1 = n1 - n2;
                }
                System.out.println("Result of first number divided by the second one is: " + result);

            } else if (n2 < n1) {
                while ((n2 - n1) < 0 || (n2 - n1) == 0) {
                    result++;
                    n2 = n2 - n1;
                }
            }
            System.out.println("Result of first number divided by the second one is: " + result);
        }else if (n1 < 0 && n2 > 0) {

            while ((n1 + n2) < 0 || (n1 + n2) == 0) {
                result++;
                n1 = n1 + n2;
            }

            System.out.println("Result of first number divided by the second one is: -"+ +result);

        }else if(n1>0 && n2<0){
            while ((n2 + n1) < 0 || (n2 + n1) == 0) {
                result++;
                n2 = n2 + n1;
            }


            System.out.println("Result of first number divided by the second one is: -"+ + result);
        }else if(n1==0){
            System.out.println("Result of first number divided by the second one is: 0");

        }else {
            System.out.println("You can not divide by 0");
        }
    }
}




