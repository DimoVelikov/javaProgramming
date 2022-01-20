package day40_FinalKeyword;

public class FinalVariable {


    final String birtheday;
    final static String name;

    static {
        name="B25";
    }

    public FinalVariable(String birtheday){
        this.birtheday = birtheday;
    }

    public static void main(String[] args) {
        final double pi = 3.14;
        //pi= 4.14;  final variables can not be reassigned

        final String name;

        name= "Java";

        //name = "Wooden Spoon"; can not be changed

        System.out.println(name);

        System.out.println("---------------");

        FinalVariable obj = new FinalVariable("feb/02");

        //obj.birtheday = "june 1"; can not be changed

        System.out.println(obj.birtheday);

        System.out.println(obj.name);

        System.out.println(FinalVariable.name);



    }

}
