package dimoPractice;

public class LoopPracticeNew2 {
    public static void main(String[] args) {

        int height = 7;
        int width = 5;
        // Write a program that will print a box of #'s taking from user the height and
        // width values.
        // ============= SAMPLE RUN ================
        // Program Starts:
        // Enter height:
        // 7
        // Enter width:
        // 5

        // Output:
        // #####
        // #####
        // #####
        // #####
        // #####
        // #####
        // #####

        //***** Your Code here ***/



        for (int i=0; i< height ; i++){
            for(int j= 0; j<width; j++){
                System.out.print("#");
            }
            System.out.println();
        }


        }

    }

