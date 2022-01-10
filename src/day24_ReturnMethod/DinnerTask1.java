package day24_ReturnMethod;

public class DinnerTask1 {

    public static void nums(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+ " ");

        }
        System.out.println();
    }
    
    public static void evenNums(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+ " ");

            }
            
        }
    }

    public static void main(String[] args) {
        nums();
        evenNums();



    }


}

/*
create a method that can print odd numbers between
 1~100 in a same line saperated by space
 */
