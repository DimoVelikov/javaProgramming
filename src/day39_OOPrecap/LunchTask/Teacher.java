package day39_OOPrecap.LunchTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Teacher", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }

}
