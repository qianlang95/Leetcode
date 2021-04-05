//Use two passes, left to right and right to left. use result array to remember the results
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]= new int[nums.length];
        res[0]=nums[0];
        for (int i=1; i<nums.length; i++){
            res[i]=nums[i]*res[i-1];
        }
        int left=1;
        for(int i=nums.length-1; i>0; i--){
            res[i]=left*res[i-1];
            left*=nums[i];
        }
        res[0]=left;
        return res;
    }
}
