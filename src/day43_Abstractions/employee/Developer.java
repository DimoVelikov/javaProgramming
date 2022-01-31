package day43_Abstractions.employee;

public final class Developer extends Employee{
    public Developer(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, id, "Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is writing codes");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 4 hours");
    }

    public void unitTest(){
        System.out.println(getName()+ " is unit testing");
    }
}
