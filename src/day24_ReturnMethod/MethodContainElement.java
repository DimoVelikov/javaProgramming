package day24_ReturnMethod;

public class MethodContainElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int element = 0;

        boolean result = contain(arr,element);

        System.out.println(result);



    }


    public static  boolean contain(int[] arr, int element){
        boolean result = false;

        for (int each : arr) {

            if(each==element){
                result= true;
            }

        }

        return result;
    }

}
