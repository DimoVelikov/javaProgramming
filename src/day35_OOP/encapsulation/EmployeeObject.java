package day35_OOP.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("Dimo");
        employee1.setAge(35);
        employee1.setGender('M');
        employee1.setSalary(200000);

        System.out.println(employee1);


    }
}
