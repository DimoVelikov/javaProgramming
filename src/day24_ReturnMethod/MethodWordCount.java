package day24_ReturnMethod;

public class MethodWordCount {
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "java";

        int result = wordCount(sentence,word);

        System.out.println(result);



    }
    public static int wordCount(String sentence, String word){
        int count = 0;

        String[] words =sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            if(words[i].equalsIgnoreCase(word)){
                count++;

        }



        }

        return count;

    }


}
