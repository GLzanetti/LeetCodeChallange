package LeetCodeChallangesDataStructures;

import java.util.Arrays;

public class LeetCode4 {
    public static int[] findErrorNums(int[] nums) {
        int duplicate = 0;
        int missing = 0;
        int[] output = new int[nums.length+1];
        for(int num: nums){
            output[num]++;
        }
        for(int i = 1; i <= output.length-1; i++){
            if(output[i] > 1){
                duplicate = i;
            }
            if(output[i] == 0){
                missing = i;
            }
        }
        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums0 = {1,1};
        int[] nums = {2,2};
        int[] nums1 = {3,2,4,4,1};
        int[] nums2 = {1,2,3,4,4,6,7,8};
        int[] nums3 = {3,2,2};

        System.out.println(Arrays.toString(findErrorNums(nums0)));
        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(findErrorNums(nums1)));
        System.out.println(Arrays.toString(findErrorNums(nums2)));
        System.out.println(Arrays.toString(findErrorNums(nums3)));
    }
}
