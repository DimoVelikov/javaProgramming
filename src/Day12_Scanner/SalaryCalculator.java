package Day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    static int hourlyRate, hours;
    static double stateTax, federalTax;
    static {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Hourly Rate:");
        hourlyRate = scan.nextInt();
        System.out.println("Enter Hours:");
        hours = scan.nextInt();
        System.out.println("Enter Federal Tax:");
        federalTax = scan.nextDouble();
        System.out.println("Enter State Tax:");
        stateTax = scan.nextDouble();
        scan.close();
    }



    public static void main(String[] args) {

        int salary = 52* hours * hourlyRate;
        double salaryStateTax = salary * stateTax;
        double salaryFederalTax = salary * federalTax;
        double totalTax = salaryFederalTax + salaryFederalTax;
        double nexIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("salaryStateTax = " + salaryStateTax);
        System.out.println("salaryFederalTax = " + salaryFederalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("nexIncome = " + nexIncome);

    }
}

/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */