package day24_ReturnMethod;

public class RemoveDouplicate {
    public static void main(String[] args) {
        String str = "cccceddddtmmm";

        str = removeDuplicate(str);

        System.out.println(str);



    }

    public static String removeDuplicate(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

        return result;


    }


}
