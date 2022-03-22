package dimoPractice.interviewQuestions;

public class RemoveDuplicates {

    /*
    • Q12: String -- Remove Duplicates.
    • Write a return method that can remove the duplicated values from String
    • Ex: removeDup("AAABBBCCC") ==> ABC
     */


    // create a static method wit String return type that will take a string as a argument
    public static String remove_duplicates(String str){

        //i will create a empty string result that will contain the result
        String result ="";

        // i will convert the string to string array and iterate it to get to each char of the string

        String[] arr = str.split("");

        for (String ch : arr) {

            // i will create a if condition that will check if the string
            // result already contain each char and is so to skip the iteration
            if(result.contains(ch)){
                continue;
            }

            // i will concatenate each char to the string result
            result+= ch;


        }


        // i will return the string result
        return result;
    }

    public static void main(String[] args) {

        System.out.println(remove_duplicates("AAABBBCCC"));

    }

}
