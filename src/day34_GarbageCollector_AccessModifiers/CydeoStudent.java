package day34_GarbageCollector_AccessModifiers;

public class CydeoStudent {

    public String name,fieldOfStudy;
    public char gender;
    public int age,batchNumber, groupNumber;

    public CydeoStudent(String name,char gender,int age, int batchNumber, int groupNumber, String fieldOfStudy  ) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public static String schoolName,programmingLanguage,secretCode;

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printSecretCode(){
        System.out.println(secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void study(){
        System.out.println(name + " is study");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
