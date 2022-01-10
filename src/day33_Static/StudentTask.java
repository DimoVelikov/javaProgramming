package day33_Static;


class StudentClass{

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;


    public StudentClass(String name) {
        this.name = name;
    }
    public StudentClass(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public StudentClass(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public StudentClass(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public StudentClass(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public StudentClass(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }



    public StudentClass(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }



}




public class StudentTask {



}
