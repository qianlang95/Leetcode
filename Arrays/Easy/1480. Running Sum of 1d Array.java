//two-pointer

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int head=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=0){
                nums[head]=nums[i];
                nums[i]=0;
                head++;
            }
        }
    }
}
