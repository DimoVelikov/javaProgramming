package day19_loopWithoutCurlyBraces;

public class UniqueChar {
    public static void main(String[] args) {

        String str = "aabccdeef";

        String result= "";



        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if(ch==each){
                    count++;
                }
            }

            if(count==1){ //if the frequency is 1 then the char is unique.
                result+= ch;

            }




        }

        System.out.println(result);








    }
}
