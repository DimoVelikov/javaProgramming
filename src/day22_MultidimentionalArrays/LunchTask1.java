package day22_MultidimentionalArrays;

public class LunchTask1 {
    public static void main(String[] args) {

        int[][] num = {{1,2,3,4,5,31},{0,2,4,56,7}};

        int min = num[0][0];
        int max = num[0][0];

        for (int i = 0; i < num.length; i++) {
            for (int i1 = num[i].length - 1; i1 >= 0; i1--) {

                if(num[i][i1]>max){
                    max=num[i][i1];
                }

                if(num[i][i1]<min){
                    min = num[i][i1];
                }

            }

        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }
}

/*
Write a program that can find the minimum and maximum
numbers from a two dimensional array
 */
