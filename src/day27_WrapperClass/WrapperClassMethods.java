package day27_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int n = Integer.parseInt(str);// return primitive

        String s1 = "is true";

        boolean b1 = Boolean.parseBoolean(s1);

        System.out.println(b1);

        String s2 = "123";

        Integer x = Integer.valueOf(s2); // return wrapper

        int y = Integer.valueOf(s2);


        System.out.println("-------------------------");


        //is digit

        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);

        System.out.println(r2);

        //is letter

        boolean r3 = Character.isLetter(ch1);

        //special char

        boolean r4 = !Character.isLetterOrDigit(ch1);

        //upperCase

        boolean b5 = Character.isUpperCase(ch1);

        //lowerCase

        boolean b6 = Character.isLowerCase(ch1);

        System.out.println("--------------------");



        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for(char each : s.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);






    }
}
