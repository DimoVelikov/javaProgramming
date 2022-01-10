package day21_Loops;

public class UniqueElements {
    public static void main(String[] args) {

        String[] students = {"Elif","Elif", "Kaluf","Kaluf", "Bebin", "David", "David", "Muimuin","Muimuin", "Aishe"};


        for (String each : students) {
            int count =0;
            for (String element : students) {

                if(element.equals(each)){
                    count++;
                }

            }

            if(count==1){
                System.out.println(each);
            }


        }






    }
}
