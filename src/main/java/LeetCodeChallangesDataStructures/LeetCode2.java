package LeetCodeChallangesDataStructures;

import java.util.Arrays;

public class LeetCode2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] shuffled = new int[nums.length];
        int n = 4;
        int j = 0;

        for(int i = 0; i <= n -1; i++){
           shuffled[j] = nums[i];
           shuffled[j+1] = nums[i+n];
           j+=2;
        }

        System.out.println(Arrays.toString(shuffled));

    }
}
