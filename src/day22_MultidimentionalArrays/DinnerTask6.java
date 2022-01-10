package day22_MultidimentionalArrays;

public class DinnerTask6 {
    public static void main(String[] args) {

        String str = "We learn Java but not Python at Cydeo, Java is fun";

        str = str.replace(",", " ");

        String[] word = str.split(" ");

        int javaCount = 0;
        int pythonCount =0;

        for (String each : word){
            if(each.equalsIgnoreCase("java")){
                javaCount++;
            }else if(each.equalsIgnoreCase("python")){
                pythonCount++;
            }

        }

        System.out.println("javaCount = " + javaCount);
        System.out.println("pythonCount = " + pythonCount);







    }
}

/*
Write a program that can return the number of appearances of “java” and “python”
anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use
				 arrays and for each loop)
 */
