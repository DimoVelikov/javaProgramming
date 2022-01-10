package day31_Constructors.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Dimo",15,"QA",110000);
        Tester tester2 = new Tester("Dimo",16,"QA",110000);
        Tester tester3 = new Tester("Dimo",11,"QA",110000);
        Tester tester4 = new Tester("Dimo",12,"QA",110000);

        Tester[] testers = {tester1,tester2,tester3,tester4};


        Developer developer1 = new Developer("Ivan",11,"Front End",120000);
        Developer developer2 = new Developer("Ivan",10,"Front End",120000);
        Developer developer3 = new Developer("Ivan",121,"Front End",120000);
        Developer developer4 = new Developer("Ivan",13,"Front End",120000);
        Developer developer5 = new Developer("Ivan",16,"Front End",120000);

        Developer[] developers = {developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrum = new ScrumTeam("Anna","Rada","Casey");

        scrum.addTesters(testers);

        scrum.addDevelopers(developers);

       // scrum.addTester(tester1); // add just one tester

        //scrum.addDeveloper(developer1); // add just one developer



        System.out.println(scrum);

        System.out.println("---------------------");


        for (Tester eachTester : scrum.testersList){
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("-----------------");

        for (Developer eachDeveloper : scrum.devopsList){
            System.out.println(eachDeveloper.name + " : "+ eachDeveloper.salary);
        }



    }
}
