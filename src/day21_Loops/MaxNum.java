package day21_Loops;

public class MaxNum {
    public static void main(String[] args) {

        int[] num = {10,5,4,20,1,0};
        int max = num[0];
        int min = num[0];


        for (int i : num) {
            if(i>max){
                max= i;
            }

        }

        for (int i : num) {
            if(i<min){
                min =i;
            }

        }

        System.out.println("max = " + max);

        System.out.println("min = " + min);



    }
}
