package day20_Arrays;

public class AvarageNum {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60};

        int sum =0;

        for (int i = 0; i < num.length; i++) {

            sum += num[i];

        }

        double avarageNum = (double) sum/num.length;

        System.out.println(avarageNum);

    }
}
