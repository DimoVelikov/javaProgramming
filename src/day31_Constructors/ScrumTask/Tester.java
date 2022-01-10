package day31_Constructors.ScrumTask;

public class Tester {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(name + "is performing smoke test");
    }

    public void creatingTicket(){
        System.out.println(name + "is creating ticket");
    }

    public void dailyStandUp(){
        System.out.println(name + "is daily Standing up");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
