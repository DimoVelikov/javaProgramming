package day37_Inheradence.scrum;

public class ScrumMaster extends Employee {
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scum Master", id, salary, companyName);
    }

        public void setMeetings () {
            System.out.println(name + " " + jobTitle + " is setting meeting");
        }

    }

