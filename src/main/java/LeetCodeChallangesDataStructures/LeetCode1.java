package LeetCodeChallangesDataStructures;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = new int[2 * nums.length];
        int j = 0;

        for(int i = 0; i <= (2 * nums.length) -1; i++){

            if(j == nums.length){
                j = 0;
            }

            ans[i] = nums[j];

            ++j;
        }

        for(int num: ans){
            System.out.println(num);
        }
    }
}
