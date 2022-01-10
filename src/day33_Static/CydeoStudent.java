package day33_Static;

public class CydeoStudent {

    public String name;
    public int age, id , batchNumber, groupNumber;
    public char gender, grade;
    static String schoolName ="Cydeo",programLanguage = "Java";


    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }


    public void study(){
        System.out.println(name+ " study");
    }

    public void attendClass(){
        System.out.println(name+ " attend class");
    }

    public void printSchoolName(){
        System.out.println(schoolName);
    }

    public void printProgramLanguage(){
        System.out.println(programLanguage);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
