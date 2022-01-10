package day21_Loops;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] num = {10,20,30,40,50,60,70};

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");

        }

        System.out.println();


        System.out.println("-------------------");

        for(int each: num){
            System.out.print(each+" ");
        }
        System.out.println();





    }
}
