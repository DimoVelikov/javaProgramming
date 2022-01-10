package dimoPractice;

import java.util.Scanner;

public class LoopPracticeNew5 {
    static boolean verify;
    static int findElementIndex (int value, int [] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                index = i;
                verify = true;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String[] user = {"Hassan", "Idris", "Trevor"};
        String[] pass = {"homecomingking", "turnupcharlie", "afraidofthedark"};
        // Suppose we have a database composed of two fields or columns (arrays),
        // the first field is for the username (user[]) and the other one is for the
        // password(pass[]) .
        // This is how it looks like:
        // user[0] = “Hassan” ;
        // user[1] =”Idris”;
        //  user[2]=”Trevor” ;
        // And their passwords correspond with their indexes.
        // pass[0] = “homecomingking”;
        // pass[1] = “turnupcharlie”;
        // pass[2] = “afraidofthedark”;
        // Then if one of them had successfully login, the output should be:
        // Enter username: Hassan
        // Enter password: homecomingking
        // Hello Hassan!
        // But if not, “Incorrect Login!”
        // You can ignore case for the username but not for the password.
        // ============= SAMPLE RUN ================
        // Program Starts:
        // Enter username:
        // hassan
        // Enter password:
        // homecomingking
        // Output:
        // Hello Hassan!

        //***** Your Code here ***/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username:");
        String userName = scan.nextLine();
        System.out.println("Enter Your Password:");
        String password = scan.nextLine();

        scan.close();

        boolean checkUserName = false;
        boolean checkPassowrd = false;
        boolean usernameToPassoword = false;


        for (String x : user) {
            if (x.equals(userName)) {
                checkUserName = true;
                break;
            }

        }


        for (String x : pass) {
            if (x.equals(password)) {
                checkPassowrd = true;
                break;
            }
        }

        if(checkPassowrd && checkUserName){
            System.out.println("Good job!");
        }else {
            System.out.println("Try again :(");
        }











    }
}








