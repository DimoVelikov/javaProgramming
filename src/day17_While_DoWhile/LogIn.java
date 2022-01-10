package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String inputUserName = scan.next();
        System.out.println("Enter your password:");
        String inputPassword = scan.next();

        String userName = "Cydeo";
        String password = "Cydeo123";


        if(inputUserName.equals(userName) && inputPassword.equals(password)){

            System.out.println("Logged in");



        }else {
            int attempts = 2;
            while (!(inputUserName.equals(userName)&& inputPassword.equals(password)) && attempts>0
            )
            {

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                inputUserName = scan.next();
                System.out.println("Enter your password:");
                inputPassword = scan.next();
                attempts = attempts-1;
            }

            if(inputUserName.equals(userName) && inputPassword.equals(password)){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked");
            }



        }
        scan.close();





    }
}
