package day39_OOPrecap.LunchTask;

public class Cydeo {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Dimo",25,'M',123,1500000);
        System.out.println(tester1);
        tester1.createTicket();
        tester1.work();
        tester1.drink();
        tester1.eat();
        tester1.sleep();
        System.out.println("------------------");
        Developer developer1 = new Developer("Anna",36,'F',1234,130000);
        System.out.println(developer1);
        developer1.fixingBugs();
        developer1.work();
        developer1.eat();
        developer1.sleep();
        developer1.drink();
        System.out.println("-------------------");
        Teacher teacher1 = new Teacher("Muhtar",33,'M',14,1000000);
        System.out.println(teacher1);
        teacher1.work();
        teacher1.drink();
        teacher1.eat();
        teacher1.sleep();
        System.out.println("--------------------");
        Student student1 = new Student("Viktor",3,'M',15,"Home play");
        System.out.println(student1);
        student1.study();
        student1.eat();
        student1.sleep();
        student1.drink();

    }
}
