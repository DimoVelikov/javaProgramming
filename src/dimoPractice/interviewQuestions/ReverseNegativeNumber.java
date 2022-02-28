package dimoPractice.interviewQuestions;

public class ReverseNegativeNumber {

    public static int reverse_number(int x){

        if((x>0&& x<10)||(x<0 && x>-10)){
            System.err.println("The number can not be reversed");
            System.exit(0);
        }

        boolean isNegative = false;

        if(x<0){
            isNegative = true;
            x = x * -1;
        }

        String number = "" + x;

        String result = "";

        for (int i = number.length()-1; i >=0 ; i--) {

            result += number.charAt(i);

        }

        if(isNegative){
            result = "-" + result;
        }




        return Integer.parseInt(result);


    }

    public static void main(String[] args) {

        int input = -12345;

        System.out.println("input  "+ input);
        System.out.println("output "+reverse_number(input));

    }
}
