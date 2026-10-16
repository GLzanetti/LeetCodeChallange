package LeetCodeChallangesDataStructures;

import java.util.Arrays;

public class LeetCode4 {
    public static int[] findErrorNums(int[] nums) {
        int duplicate;
        int[] output = {};

        for(int i = 1; i <= nums.length -1; i++) {
            duplicate = nums[i - 1];
            if (duplicate == nums[i]) {
                if (nums[0] < nums[1] || nums[0] == 1) {
                    output = new int[]{duplicate, duplicate + 1};
                } else {
                    output = new int[]{duplicate, duplicate - 1};
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums0 = {1,1};
        int[] nums = {2,2};
        int[] nums1 = {1,2,2,4};
        int[] nums2 = {1,2,3,4,4,6,7,8};
        int[] nums3 = {3,2,2};

        System.out.println(Arrays.toString(findErrorNums(nums0)));
        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(findErrorNums(nums1)));
        System.out.println(Arrays.toString(findErrorNums(nums2)));
        System.out.println(Arrays.toString(findErrorNums(nums3)));
    }
}
