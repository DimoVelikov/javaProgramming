package day24_ReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        System.out.println(maxNum(10,50)*2);

    }

    public static int maxNum(int num1, int num2){

        int result = 0;

        if(num1>num2){
            result = num1;
        }else {
            result= num2;
        }

        return result;


    }


}
