#Two sum
/*
Share
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++){
            int rem=target-nums[i];
            if (m.containsKey(rem)){
                res[0]=i;
                res[1]=m.get(rem);
                return res;
            }else{
                m.put(nums[i],i);
            }
        }
        return res;
    }
}
