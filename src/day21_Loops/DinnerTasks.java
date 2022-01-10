package day21_Loops;

public class DinnerTasks {
    public static void main(String[] args) {

        String[] classmates = {"Ivan Velikov","Peter Peev","Ivailo Iovchev","Stanislav Edrev",
                "Kristian Rusev","Stefan Haralapmiev","Petar Rashkov","Bobbi Katev", "Pavlin Kateliev",
        "Anton Lamev"};

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].charAt(0) + "."+ classmates[i].charAt(classmates[i].indexOf(" ")+1)+".");

        }

    }
}

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */