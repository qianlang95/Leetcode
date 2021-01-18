//every part should=sum/3, can have more than 3 parts
/*
Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.

Formally, we can partition the array if we can find indexes i + 1 < j with (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])
*/

class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for (int n:arr) sum+=n;
        if (sum%3!=0){
            return false;
        }
        int div=sum/3;
        int acc=0;
        int part=0;
        for (int i=0; i<arr.length; i++){
            acc+=arr[i];
            if (acc==div) {acc=0; part++;}
        }
        System.out.println(part);
        return part>=3;
    }
}
