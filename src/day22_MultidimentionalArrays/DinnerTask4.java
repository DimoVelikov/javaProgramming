package day22_MultidimentionalArrays;

public class DinnerTask4 {
    public static void main(String[] args) {

        String[] str = {"anna", "level", "Java","Neven"};

        int count = 0;
        for (String each : str){
            String reverse = "";


            for (int i = each.length()-1; i >=0; i--) {

                reverse += "" +each.charAt(i);


            }

            if(reverse.equalsIgnoreCase(each)){
                count++;
            }

        }

        System.out.println(count);








    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
