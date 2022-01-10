package day21_Loops;

public class AvarageNum {
    public static void main(String[] args) {
        int[] num= {10,20,30,40,50,60};

        double sum = 0;

        for (int i : num) {

            sum += i;

        }

        System.out.println(sum/num.length);




    }
}
