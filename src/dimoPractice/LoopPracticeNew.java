package dimoPractice;

public class LoopPracticeNew {
    public static void main(String[] args) {
        String input = "I will be a Java developer soon!";
        // Use input String to determine the number of 'a'
        // ============= SAMPLE RUN ================
        // Program Starts:
        // Output:
        // Number of a's: 3

        //***** Your Code here ***/
        char temp;
        int totalCount = 0;
        for(int i = 0; i<input.length(); i++)
        {
            temp = input.charAt(i);
            if(temp == 'a')
                totalCount++;
            }
        System.out.println(totalCount);
        }
    }

