package day39_OOPrecap.LunchTask;

public class Student extends Person {

    private int studentId;
    private String fieldOfStudy;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if(studentId<0){
            System.err.println("Student Id can not be negative "+ studentId);
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy==null){
            System.err.println("Filed of study can not be null");
            System.exit(1);
        }
        if(fieldOfStudy.isEmpty()||fieldOfStudy.isBlank()){
            System.err.println("Filed of study can not be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }

    public void study(){
        System.out.println(getName()+" is study");
    }



}
