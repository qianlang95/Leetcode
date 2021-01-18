//max[i]=acc[i]-min_acc[i]
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length==1) return nums[0];
        int min=Math.min(nums[0],0);
        int max=nums[0];
        int acc=nums[0];
        for (int i=1; i<nums.length; i++){
            acc+=nums[i];
            max=Math.max(acc-min, max);
            min=Math.min(min, acc);
        }
        return max;
        
    }
}
