package day20_Arrays;

public class MinNumOfArray {
    public static void main(String[] args) {

        int[] num = {100,500,40,600,80,90};

        int min = num[0];


        for (int i = 0; i < num.length; i++) {

            if(num[i]<min){
                min = num[i];
            }

        }

        System.out.println(min);


        System.out.println(12345/10);



    }
}
