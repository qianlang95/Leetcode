//ArrayList add in the front has high complexity
/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
*/
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res=new ArrayList<Integer>();
        int pos=A.length-1;
        int up=0;
        while(K>0 || pos>=0){
            int d1=K%10;
            K=K/10;
            int d2=pos<0?0:A[pos--];
            int val=d1+d2+up;
            up=0;
            if (val>9){
                up=1;
                val=val%10;
            }
            res.add(val); 
        }
        if (up!=0){
            res.add(up);
        }
        Collections.reverse(res);
        return res;
    }
}
