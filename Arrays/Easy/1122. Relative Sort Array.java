//sort the numbers not included and use dictionary to rearrange the numbers included 
/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
*/
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> m=new HashMap<>();
        for (int k: arr2){
            m.put(k,0);
        }
        int end=arr1.length-1;
        for (int i=arr1.length-1; i>=0; i--){
            int n=arr1[i];
            if (m.containsKey(n)){
                m.put(n,m.get(n)+1);
            }else{
                arr1[end--]=n;
            }
        }
        if (end<arr1.length-1){
            Arrays.sort(arr1, end+1, arr1.length);
        }
        int start=0;
        for (int k: arr2){
            int count=m.get(k);
            while(count>0){
                arr1[start++]=k;
                count--;
            }
        }
        return arr1;
    }
}
