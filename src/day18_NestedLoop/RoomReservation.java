package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        int king = 120;
        int queen = 100;
        int single = 80;

        Scanner scan = new Scanner(System.in);
        int totalPrice=0;

        while (true) {

            System.out.println("Please enter room type: (King/Queen/Single)");
            String roomType = scan.next();

            while (!(roomType.equalsIgnoreCase("king") ||
                    roomType.equalsIgnoreCase("queen") ||
                    roomType.equalsIgnoreCase("single"))) {
                System.err.println("Invalid entry. Please re-enter:");
                System.out.println("Please enter room type: (King/Queen/Single)");
                roomType = scan.next();

            }


            if (roomType.equalsIgnoreCase("king") ||
                    roomType.equalsIgnoreCase("queen") ||
                    roomType.equalsIgnoreCase("single")) {
                System.out.println("Please enter how many nights you would like to stay?");
                int nights = scan.nextInt();
                while (!(nights > 0)) {
                    System.err.println("Invalid Entry! Please re-enter:");
                    System.out.println("Please enter how many nights you would like to stay?");
                    nights = scan.nextInt();

                }

                if (roomType.equalsIgnoreCase("king")) {
                    totalPrice += king * nights;

                } else if (roomType.equalsIgnoreCase("queen")) {
                    totalPrice += queen * nights;

                } else {
                    totalPrice += single * nights;

                }

                System.out.println("Would you like to reserve another room? (yes/no)");
                String a = scan.next();

                while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                    System.err.println("Invalid Entry! Please re-enter:");
                    System.out.println("Would you like to reserve another room? (yes/no)");
                    a = scan.next();
                }



                if(a.equalsIgnoreCase("no")){
                    break;
                }


            }
        }

            System.out.println("Total price is : $"+totalPrice);


            /*
            System.out.println("Please enter how many nights you would like to stay?");
            int nights = scan.nextInt();

            System.out.println("Would you like to reserve another room? (yes/no)");
            String a = scan.next();

            if(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no")) {
                if(a.equalsIgnoreCase("no")){
                    break;
                }

                while (!(a.equalsIgnoreCase("no"))) {
                    if (roomType.equalsIgnoreCase("King")) {
                        totalPrice = king * nights;

                    } else if (roomType.equalsIgnoreCase("Queen")) {
                        totalPrice = queen * nights;

                    } else if (roomType.equalsIgnoreCase("Single")) {
                        totalPrice = single * nights;
                    } else {
                        System.err.println("Invalid Entry! Please re-enter:");
                        roomType = scan.next();
                    }

                }



            }else {
                System.err.println("Invalid Entry! Please re-enter:");
                a = scan.next();
            }
*/








        //System.out.println(totalPrice);




    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how
             many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user
            	provides a valid entry


 */