//in one pass, record min_diff and all pairs matches it. somehow performance not optimal.
/*Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements. 

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
*/
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        List<List<Integer>> res=new ArrayList<>();
        for (int i=0; i<arr.length-1; i++){
            int val=Math.abs(arr[i]-arr[i+1]);
            if (val<min_diff){
                min_diff=val;
                res=new ArrayList<>();
            }
            if (val==min_diff){
                List<Integer> new_pair=new ArrayList<>();
                new_pair.add(arr[i]);
                new_pair.add(arr[i+1]);
                res.add(new_pair);
            }
        }
        return res;
    }
}
