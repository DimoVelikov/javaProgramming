package day34_GarbageCollector_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100; // public modifier

    static int defaultData = 200; // default modifier

    private static int privateData = 300; //private modifier


    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);


    }




}
