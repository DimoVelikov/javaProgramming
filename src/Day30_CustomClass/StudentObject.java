package Day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {


        Students st1 = new Students();

        st1.infoStudents("Dimo",'M',35,007,'A');

        Students st2 = new Students();

        st2.infoStudents("John",'M',29,5512,'B');

        Students st3 = new Students();

        st3.infoStudents("Peter",'F',28,2727,'C');

        Students st4 = new Students();

        st4.infoStudents("Pamela",'F',22,227,'C');

        Students st5 = new Students();

        st5.infoStudents("Alexa",'F',22,1227,'A');


        ArrayList<Students> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Students> angryBirds = new ArrayList<>();

        Students[] students = {st1, st2, st3, st4, st5};

        for (Students student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);

        System.out.println(angryBirds);






    }
}
