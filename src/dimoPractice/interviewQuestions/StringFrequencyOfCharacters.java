package dimoPractice.interviewQuestions;

public class StringFrequencyOfCharacters {

    /*
    Q10: String -- Frequency of Characters
    • Write a return method that can find the frequency of characters
     Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    // Create a method with string return type and string argument
    public static String frequencyOfCharacter(String str){

        // Create a string result that will contain the result and will be returned on the end
        String result= "";

        // Convert the String to a String array
        String[] arr = str.split("");

        // Iterate the array using a for each loop
        for (String char1 : arr) {

            // I will create a variable int to contain the frequency
            int frequency = 0;

            // I will create an inner for each loop
            for (String char2 : arr) {


                // I will increase my frequency if the character is repeated
                if(char1.equals(char2)){
                    frequency++;

                }

            }

            // i will crate a condition that will skip the iteration if the result contain the character
            if(result.contains(""+char1)){
                continue;
            }

            // i will concatenate the character and the frequency to the result
            result += char1 + frequency;

        }



        return result;
    }




    public static void main(String[] args) {

        System.out.println(frequencyOfCharacter("AAABBCDD"));
    }

}
