package day24_ReturnMethod;

public class WarmpUpTask {
    public static void main(String[] args) {
        initials("Dimo", "Velikov");
        domain("dveliko@gmail.com");
        months(2);
        days(5);
        daysInMonth(3);


    }

    public static void initials(String firstName,String lastName){

        System.out.println(firstName.charAt(0)+ "."+ lastName.charAt(0)+".");
    }

    public static void domain(String email){
        System.out.println(email.substring(email.indexOf("@")+1));
    }

    public static void months(int month){
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

        }
    }

    public static void days(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }

    public static void daysInMonth(int month){
        switch (month){
            case 2:
                System.out.println("28 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            default:
                System.out.println("31 Days");
                break;
        }
    }

}


/*
1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

 */
