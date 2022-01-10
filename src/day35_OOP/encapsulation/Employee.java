package day35_OOP.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.err.println("Name is empty");
            System.exit(0);
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {

            this.gender = gender;
        } else {
            System.err.println("Invalid gender input");
            System.exit(0);
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 16 || age > 90) {
            System.err.println("Invalid age input");
            System.exit(0);
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Invalid salary input");
        }
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary= $" + salary +
                '}';
    }
}
