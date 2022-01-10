package dimoPractice;

import java.util.Scanner;

class LoopsPractice {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // Java Loops II - Hacker Rank Solution Java START
            for (int j = 0; j < n; j++)
            {
                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
            // Java Loops II - Hacker Rank Solution Java END
        }

        in.close();

        // (a+2^0*b), (a+2^0*b+2^1*b).......(a+2^0*b+2^1*b......+2^n-1*b)



    }
}