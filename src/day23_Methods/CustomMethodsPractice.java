package day23_Methods;

public class CustomMethodsPractice {
    public static void helloWorld(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }
    }
     public static void hellowCydeo(){
         for (int i = 0; i < 5; i++) {
             System.out.println("Hello Cydeo");

         }
     }

     public static void oddEven(int num){
        if(num%2==0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
     }

    public static void main(String[] args) {

        oddEven(5);
        oddEven(6);




    }


}
