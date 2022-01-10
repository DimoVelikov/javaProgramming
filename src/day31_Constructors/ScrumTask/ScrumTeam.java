package day31_Constructors.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;

    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> devopsList = new ArrayList<>();
    int daysOfSprint;


    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeId){
        testersList.removeIf(p -> p.employeeID == employeeId);

    }

    public void removeDeveloper(int employeeId){

        devopsList.removeIf(p -> p.employeeID == employeeId);

    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testersList=" + testersList.size() +
                ", devopsList=" + devopsList.size() +
                '}';
    }
}
