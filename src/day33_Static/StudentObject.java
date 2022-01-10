package day33_Static;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Dimo");

        Student student2 = new Student("Dimo", 'M');

        Student student3 = new Student("Dimo", 11);

        Student student4 = new Student("Dimo", 12,'A');

        Student student5 = new Student("Dimo",'M',28);

        Student student6 = new Student("Dimo",'M',35,7);

        Student student7 = new Student("Dimo", 'M',35,7,'A');


        Student[] students ={student1,student2,student3,student4,student5,student6,student7};


        System.out.println(Arrays.toString(students));


    }
}
