package day16;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        //write your codes here:

        String sender;
        String phoneNumber;
        String messageBody;

        sender = message.substring(message.indexOf("<"),message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf("["),message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{"),message.indexOf("}"));

        System.out.println("Sender: " + sender +"\n"+
                "Phone Number: "+ phoneNumber + "\n"+
                "Message Body: " + messageBody);

        //Sender:<Mike Smith>. From Number:[202-123-3456].
        // Message:{I love programing and problem solving}





    }
}
