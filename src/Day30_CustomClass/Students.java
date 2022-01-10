package Day30_CustomClass;

public class Students {
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public void infoStudents(String name, char gender, int age, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");

    }
    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void code(){
        System.out.println(name + " is coding");
    }

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
}
