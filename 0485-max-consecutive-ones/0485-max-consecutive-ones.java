class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,count=0,maxcount=0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
            }
            else{
                maxcount=Math.max(count,maxcount);
                count=0;
            }
            i++;
        }
        return Math.max(count,maxcount);
    }
}