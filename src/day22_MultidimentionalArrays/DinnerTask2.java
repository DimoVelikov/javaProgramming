package day22_MultidimentionalArrays;

public class DinnerTask2 {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7};



        int evenCount = 0;
        int oddCount = 0;


        for(int each: num){
            if(each%2!=0){
                oddCount++;
            }else {
                evenCount++;
            }
        }


        System.out.println("oddCount = " + oddCount);
        System.out.println("evenCount = " + evenCount);





    }
}

/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */
