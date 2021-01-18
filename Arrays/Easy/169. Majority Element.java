//use two pointers from end to front

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1;
        int tail=nums1.length-1;
        while(i>=0 && j>=0){
            if (nums1[i]>nums2[j]){
                nums1[tail--]=nums1[i--];
            }else{
                nums1[tail--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[tail--]=nums2[j--];
        }

    }
}
