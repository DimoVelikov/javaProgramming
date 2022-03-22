package dimoPractice.interviewQuestions;

public class Q16_StringPasswordValidation {

    /*
    : String -- Password Validation Task 1: Write a return method that can verify if a password is valid or
not.
Requirements:
1. Password MUST be at least 6 characters and should not contain space.
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
     */

    /**
    // i will create a method with boolean return type and will take String as an argument
     */
    public static boolean passwordValidation(String password){

        /**
        //i will create a boolean for each condition and if all the conditions are true
        //i will return true
        */

        boolean result = false;

        /**
        //i will use the length method to check if the password meet the min char requirement
         */

        boolean minChars = password.length()>=6;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialChar = false;
        boolean digit = false;

        /**
        // i will use the toCharArray method to turn the given String to a char array and
        // i will iterate it with for each loop
         */

        char[] chars = password.toCharArray();


        for (char eachChar : chars) {

            /**

            //inside the loop i will create a if statement for the rest of the conditions
            //i will use the Character methods isUpperCase,isLowerCase,isDigit and
            // isLetterOrDigit for the special character to check if the given input meets
            // the requirements

             */

            if(Character.isUpperCase(eachChar)){
                upperCase = true;
            }

            if(Character.isLowerCase(eachChar)){
                lowerCase = true;
            }

            if(!Character.isLetterOrDigit(eachChar)){
                specialChar= true;
            }

            if(Character.isDigit(eachChar)){
                digit = true;
            }

        }



        if(minChars&&upperCase&&lowerCase&&specialChar&&digit){
            result = true;
        }



        return result;
    }

    public static void main(String[] args) {

        System.out.println(passwordValidation("$Password123"));

    }
}
