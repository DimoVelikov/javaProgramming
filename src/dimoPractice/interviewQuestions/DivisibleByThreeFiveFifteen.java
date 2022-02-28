package dimoPractice.interviewQuestions;

public class DivisibleByThreeFiveFifteen {


    public static void main(String[] args) {

        String reslut= "";

        for (int i = 1; i < 100; i++) {
            if(i%15==0){
                reslut += i +" ";
            }
        }

        System.out.println(reslut);


    }
}
