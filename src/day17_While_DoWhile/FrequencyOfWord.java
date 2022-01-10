package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "Java Java Python Python";

        int frequnecy = 0;

        /*

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequnecy ++;
        }

        System.out.println(frequnecy);

         */

        System.out.println("---------------");



        String newStr = "cat cat cat dog toy cat";

        while (newStr.contains("cat")){
           newStr = newStr.replaceFirst("cat", "") ;
           frequnecy++;

        }
        System.out.println(frequnecy);


    }
}
