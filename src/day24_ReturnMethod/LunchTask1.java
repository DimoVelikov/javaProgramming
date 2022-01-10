package day24_ReturnMethod;

public class LunchTask1 {
        static public void uniqueChar(String sentence){
            String ch ="";
            for (int i = 0; i < sentence.length(); i++) {
                String str = "" + sentence.charAt(i);

                if(sentence.indexOf(str)==sentence.lastIndexOf(str)){
                    ch +=str;
                }


            }
            System.out.println(ch);
        }

    public static void main(String[] args) {
        uniqueChar("AABCCD");
    }
}
