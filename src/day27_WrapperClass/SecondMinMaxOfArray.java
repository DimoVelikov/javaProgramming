package day27_WrapperClass;

public class SecondMinMaxOfArray {
    public static void main(String[] args) {
        int[] arr= {1,1,1,3,2,3,4,5,5,2};

        String result = secondMinAndMax(arr);

        System.out.println(result);



    }



    public static String secondMinAndMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];


        for (int each : arr) {

            if(each<min){
                min = each;
            }
            if(each>max){
                max = each;
            }


        }

        int secondMin = max;
        int secondMax = min;

        for (int each : arr) {

            if(each== min|| each==max){
                continue;
            }
            if(each<secondMin){
                secondMin = each;
            }
            if(each>secondMax){
                secondMax= each;
            }

        }





        String result = "secondMin = " + secondMin + " secondMax = " + secondMax;


        return result;









    }
}
