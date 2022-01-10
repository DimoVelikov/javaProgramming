package day24_ReturnMethod;

public class LunchTask2 {
    public static void main(String[] args) {
        uniqueElement(new int[]{1, 2, 2, 3, 3, 4, 4, 5});


    }

    public static void uniqueElement(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            int count =0;

            for (int i1 = 0; i1 < nums.length; i1++) {

                if(nums[i]==nums[i1]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }












    }


}
