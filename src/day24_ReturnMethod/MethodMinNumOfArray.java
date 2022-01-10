package day24_ReturnMethod;

public class MethodMinNumOfArray {
    public static void main(String[] args) {

        int[] nums = {2,5,7,8,11};

        int min = minNumOfArray(nums);

        System.out.println(min);



    }

    public static int minNumOfArray(int[] nums){
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if(min>nums[i]){
                min= nums[i];
            }

        }

        return min;

    }


}
