package day19_loopWithoutCurlyBraces;

public class FrOfChPr1 {
    public static void main(String[] args) {
        String str = "aebbdiimo";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if(ch==each){
                    count++;
                }

            }
            if(count==2){
                result +=""+ch;
            }

        }



        System.out.println(result.charAt(0));



    }
}

/*
1. Write a program that can return the first duplicated character from a string
 */