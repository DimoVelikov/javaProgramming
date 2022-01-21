package day41_Exceptions;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try{
            System.out.println(a/b); // unchecked exception
        }catch (Exception e){
            System.err.println("You can not divided by 0");

        }

        System.out.println("wooden spoon");

        System.out.println("---------------");

        char[] ch = {'A','B','C'};

        try{
            System.out.println(ch[99]);// unchecked exception
        }catch (Exception e){
            System.err.println("Index out of bounce");
        }

        System.out.println("You are doing great!");

        //Thread.sleep(2131); checked exception

        System.out.println("Cydeo");

       // FileInputStream file = new FileInputStream("path of the file");  checked exception




    }
}
