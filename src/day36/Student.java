package day36;

public class Student {

    private String name, schoolName;
    private int age;
    private char gender,grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("Name can not be empty");
            System.exit(0);
        }
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<5||age>90){
            System.err.println("Age must be between 5 and 90");
            System.exit(0);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='M'||gender=='F'){
            this.gender = gender;
        }else{
            System.err.println("Invalid entry");
            System.exit(0);
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F'){
            this.grade = grade;
        }else{
            System.err.println("Invalid entry");
            System.exit(0);
        }

    }

    public Student(String name , int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public void  study(){
        System.out.println(name+ "its study");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }


    public static void main(String[] args) {
        Student student1 = new Student("Dimo",-35,'M','A',"Cydeo");

        System.out.println(student1);
    }


}
