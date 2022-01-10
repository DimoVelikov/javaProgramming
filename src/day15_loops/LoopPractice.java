package day15_loops;

public class LoopPractice {
    public static void main(String[] args) {
        for(int i =15; i<=45;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Hello");

        for(int i = 100; i>=50; i--){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("----------------------------");


        for(int i =1;i<55; i++){

            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();


        System.out.println("----------");


        for(char i = 'A'; i<'Z'; i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("-------------");

        for(char i = 'a';i<'z';i++){
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println("---------------------");


        for(char i = 'Z';i >='A';i--){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("--------------------------");


        for (char i ='z';i<='a';i--){

            System.out.println(i+" ");

        }

        System.out.println();

    }
}
