package day39_OOPrecap.LunchTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing");
    }

    public void fixingBugs(){
        System.out.println(getName()+ " is fixing bugs");
    }
}
