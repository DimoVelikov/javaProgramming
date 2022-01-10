package day37_Inheradence.scrum;

public class AmazonInc {
    public static void main(String[] args) {

        String company= "Amazon";
        ProductOwner productOwner = new ProductOwner("Ivan",33,'M',12,100000,company);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Anna",36,'F',"BA",16,120000,company);
        ScrumMaster scrumMaster = new ScrumMaster("Dimo",35,'M',7,1500000,company);

        Tester tester1 = new Tester("Dimo",35,'M',"SDET",15,150000,company);
        Tester tester2 = new Tester("Dimo",35,'M',"SDET",15,150000,company);
        Tester tester3 = new Tester("Dimo",35,'M',"SDET",15,150000,company);
        Tester tester4 = new Tester("Dimo",35,'M',"SDET",15,150000,company);
        Tester tester5 = new Tester("Dimo",35,'M',"SDET",15,150000,company);

        Developer developer1 = new Developer("Coco",41,'F',"DEV",21,12000,company);
        Developer developer2 = new Developer("Coco",41,'F',"DEV",21,12000,company);
        Developer developer3 = new Developer("Coco",41,'F',"DEV",21,12000,company);
        Developer developer4 = new Developer("Coco",41,'F',"DEV",21,12000,company);
        Developer developer5 = new Developer("Coco",41,'F',"DEV",21,12000,company);


        ScrumTeam scrumTeam = new ScrumTeam(productOwner,businessAnalyst,scrumMaster);

        scrumTeam.addTester(tester1);
        scrumTeam.addTester(tester2);
        scrumTeam.addTester(tester3);
        scrumTeam.addTester(tester4);
        scrumTeam.addTester(tester5);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDeveloper(developer2);
        scrumTeam.addDeveloper(developer3);
        scrumTeam.addDeveloper(developer4);
        scrumTeam.addDeveloper(developer5);

        for (Developer each : scrumTeam.developers) {
            System.out.println(each.name);
        }

        for (Tester each : scrumTeam.testers) {
            System.out.println(each.name);
        }

        System.out.println(scrumTeam);


    }
}
