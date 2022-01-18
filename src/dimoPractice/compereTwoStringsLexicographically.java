package dimoPractice;

public class compereTwoStringsLexicographically {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String currentString = s.substring(0,k);

        smallest = currentString;
        largest = currentString;

        for (int i = 0; i < s.length() - k+1; i++) {
            currentString = s.substring(i,i+k);
            if(currentString.compareTo(smallest)<0){
                smallest = currentString;
            }

            if(currentString.compareTo(largest)>0){
                largest= currentString;
            }

        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        System.out.println(getSmallestAndLargest("welcometojava",3));

        System.out.println("---------------");

        String s= "welcometojava";
        int k = 3;
        for (int i = 0; i < s.length()-k+1; i++) {
            System.out.println(s.substring(i,i+k));
        }






    }
}




