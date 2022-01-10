package day24_ReturnMethod;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {

        String str1 = grate(85);

        System.out.println(str1);

        if(str1.equalsIgnoreCase("a")){
            System.out.println("Excellent");
        }else if(str1.equalsIgnoreCase("b")){
            System.out.println("Great");
        }else if(str1.equalsIgnoreCase("c")){
            System.out.println("Good");
        }else if(str1.equalsIgnoreCase("d")){
            System.out.println("Passed");
        }else if(str1.equalsIgnoreCase("f")){
            System.out.println("Failed");
        }






    }

    public static String grate(int score){
        String result= "";

        if(score<0||score>100){
            result ="Invalid";
        }else {
            result= (score>=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" : "F";
        }




        return result;



    }


}
