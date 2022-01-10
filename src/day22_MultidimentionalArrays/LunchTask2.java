package day22_MultidimentionalArrays;

public class LunchTask2 {
    public static void main(String[] args) {
        int[][] num = {{1,2,3,4,5,31},{5,2,4,56,7}};

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < num.length; i++) {
            for (int i1 = num[i].length - 1; i1 >= 0; i1--) {

                if(num[i][i1]%2==0){
                    evenCount++;
                }else {
                    oddCount++;
                }



            }

        }

        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);





    }
}

/*
Write a program that can count the total odd and even numbers from a two dimensional array
 */
