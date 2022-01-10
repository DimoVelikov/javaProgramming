package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourly Rate, weeklyHours

        int hourlyRate = 65;
        int weeklyHours = 45;


        int salary = hourlyRate * weeklyHours * 52;

       // System.out.println(salary); soutv print a variable

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);



    }
}
