package day24_ReturnMethod;

public class MethodMaxNumOfArray {
    public static void main(String[] args) {

        int[] nums = {1,4,5,22,14,19};

        int max = maxOfArray(nums);

        System.out.println(max);



    }

    public static int maxOfArray(int[] nums){
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max= nums[i];
            }


        }

        return max;

    }


}
