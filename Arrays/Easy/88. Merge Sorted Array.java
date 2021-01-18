//use two pointers from end to front

/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
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
