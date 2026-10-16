package LeetCodeChallangesDataStructures;

public class LeetCode3 {
    public static int findMaxConsecutiveOnes(int[] nums){
        int consecutive = 0;
        int maxconsecutive = 0;

        for(int i = 0; i<= nums.length-1; i++){
            if(nums[i] == 1){
                consecutive++;
            }
            if(nums[i] != 1){
                consecutive = 0;
            }
            if(consecutive >= maxconsecutive){
                maxconsecutive = consecutive;
            }
        }

        return maxconsecutive;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,0};
        int[] nums1 = {1,0,0,1,1,1};
        int[] nums2 = {1,0,0,0,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findMaxConsecutiveOnes(nums1));
        System.out.println(findMaxConsecutiveOnes(nums2));

    }
}
