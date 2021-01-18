//take care of the head and tail first, two pointer

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/


class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        for (int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        int head=0, tail=nums.length-1, i=nums.length-1;
        while(head<=tail){
            if (nums[head]<nums[tail]){
                res[i--]=nums[tail--];
            }else{
                res[i--]=nums[head++];
            }
        }
        return res;
    }
}
