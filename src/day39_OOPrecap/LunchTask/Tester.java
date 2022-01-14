package day39_OOPrecap.LunchTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing");
    }

    public void createTicket(){
        System.out.println(getName()+ " is creating a ticket");
    }

}
