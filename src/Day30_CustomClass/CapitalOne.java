package Day30_CustomClass;

import java.util.ArrayList;

public class CapitalOne {

    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setInfo("Dimo",007,'M',"Regional Manager",95000,false);


        Employee emp2 = new Employee();
        emp2.setInfo("Dimo",007,'M',"Regional Manager",95000,false);

        Employee emp3 = new Employee();
        emp3.setInfo("Dimo",007,'M',"Regional Manager",195000,true);

        Employee emp4 = new Employee();
        emp4.setInfo("Dimo",007,'M',"Regional Manager",5000,false);

        Employee emp5 = new Employee();
        emp5.setInfo("Dimo",007,'M',"Regional Manager",95000,true);


        Employee[] employees = {emp1,emp2,emp3,emp4,emp5};

        ArrayList<Employee> fullTime = new ArrayList<>();

        for (Employee each : employees) {

            if(each.isFullTime){
                fullTime.add(each);
            }


        }

        System.out.println("Full time employee are :" + fullTime.size());

        int minSalary = employees[0].salary;

        int maxSalary = employees[0].salary;

        for (Employee each : employees) {
            if(each.salary>maxSalary){
                maxSalary = each.salary;

            }
            if(each.salary<minSalary){
                minSalary = each.salary;
            }

        }

        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);




    }


}
