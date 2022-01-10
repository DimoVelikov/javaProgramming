package day34_GarbageCollector_AccessModifiers;

public class iPhoneObject {
    public static void main(String[] args) {

        iPhone iPhone1 = new iPhone("13","Black","Japan","USA",1000,10);

        System.out.println(iPhone1);

        iPhone.printOperatingSystem();
        iPhone.call(2023302613);
        System.out.println(iPhone.isSmartPhone);

        System.out.println("--------------");





        







    }

}
