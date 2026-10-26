class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxcount=0;
        for(int i:nums){
            if(i==1){
                count++;
            }
            else{
                maxcount=Math.max(count,maxcount);
                count=0;
            }
        }
        return Math.max(count,maxcount);
    }
}