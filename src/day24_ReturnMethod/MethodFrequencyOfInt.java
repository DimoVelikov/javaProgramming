package day24_ReturnMethod;

public class MethodFrequencyOfInt {
    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};
        int element = 1;

        int result = frequencyOfInt(array,element);

        System.out.println(result);



    }

    public static int frequencyOfInt(int[] arr, int element){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== element){
                count++;
            }

        }
        return count;


    }

}
