package day43_Abstractions.employee;

public final class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, id, "Teacher", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" us sleeping 12 hours");
    }


}
