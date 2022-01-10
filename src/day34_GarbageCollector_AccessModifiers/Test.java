package day34_GarbageCollector_AccessModifiers;


public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData); // can be access from anywhere

        System.out.println(AccessModifiers.defaultData); // can be access from anywhere in the same package

        //System.out.println(AccessModifiers.privateData); --- can be access only in the same class




    }

}
