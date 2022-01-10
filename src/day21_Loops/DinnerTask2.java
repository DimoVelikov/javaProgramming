package day21_Loops;

public class DinnerTask2 {
    public static void main(String[] args) {

        String[] reverse = new String[10];


        String[] classmates = {"Ivan Velikov","Peter Peev","Ivailo Iovchev","Stanislav Edrev",
                "Kristian Rusev","Stefan Haralapmiev","Petar Rashkov","Bobbi Katev", "Pavlin Kateliev",
                "Anton Lamev"};




        for (int j = 0; j < classmates.length; j++) {


            for (int i = classmates[j].length() - 1; i >= 0; i--) {

                reverse[j] += ""+classmates[j].charAt(i);


            }
            System.out.println(reverse[j].replace("null",""));

        }

























    }
}

/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */