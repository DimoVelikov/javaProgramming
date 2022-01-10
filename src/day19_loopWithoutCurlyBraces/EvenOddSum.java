package day19_loopWithoutCurlyBraces;

public class EvenOddSum {
    public static void main(String[] args) {
        int num = 12345;

        int temp = num;
        int evenSum=0;
        int oddSum=0;
        int reminder =0;


        while (temp>0){
            reminder = temp%10;
            temp = temp/10;

            if(reminder%2==0){
                evenSum += reminder;
            }else {
                oddSum += reminder;
            }

        }

        System.out.println("oddSum = " + oddSum);
        System.out.println("evenSum = " + evenSum);

    }
}

/*
Write a program that reads a set of integers,
and then prints the sum of the even and odd integers.
 */