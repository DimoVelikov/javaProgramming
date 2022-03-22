package dimoPractice.interviewQuestions;

public class StringSameLetters {

    /*
    Q11: String -- Same letters
   • Write a return method that check if a string is build out of the same letters as another
   string.
   • Ex: same("abc", "cab"); -> true
   • same("abc", "abb"); -> false:

     */

    // create a method with boolean return type and take 2 Strings as a argument

    public static boolean sameLetters(String str1, String str2){


        //Solution 1: is converting both strings to char array and use a sort method then compare them


        //Solution 2:

        // check if the string lengths are different if they are return false

        if(str1.length()!=str2.length()){
            return false;
        }

        // i will create a String array from the second string

        String[] arr = str2.split("");

        // i will iterate the array to gain access to each char from the second string
        // and remove from the first string all matching char

        for (String ch : arr) {

            str1 = str1.replaceFirst(ch,"");

        }

        //if str1 is empty i will return true

        return str1.isEmpty();


    }

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));
    }

}
