package dimoPractice;

public class FINRA {

    // declaring a method with public access modifier with return type void and no parameters

    public static void finra(){





        /*
         We will use a for loop with iteration starting 1 and condition to be executed until
         i is smaller or equal to 30 and every time the loop is executed
         there will be increment of i
         */
        for (int i = 1; i <= 30; i++) {


           // We will use if statement to check if values of i are multiple of both 3 and 5
            if(i%3==0&& i%5==0){
                System.out.print("FINRA ");
            }
            // We will use else if statement with condition i to have 0 remainder of 3

            else if(i%3==0){
                System.out.print("FIN ");
            }else if(i%5==0){
                System.out.print("RA ");

            }else {
                System.out.print(i+ " ");
            }
        }

    }

    public static void main(String[] args) {

        finra();
    }



}


/*
 Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers
which are a multiple of 3, print
"FIN" instead of the number and for numbers which are a multiple of 5,
print "RA" instead of the number. for
numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number
 */
