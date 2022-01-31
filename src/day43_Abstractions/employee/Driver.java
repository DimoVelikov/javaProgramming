package day43_Abstractions.employee;

public final class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, id, "Driver", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 2 hours");
    }
}
