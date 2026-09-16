class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max_count=0;
        int current_count=0;
        int j=0;
        while(j<n){
            if(nums[j]==1){
                current_count++;
            }
            else{
                max_count=Math.max(current_count,max_count);
                current_count=0;
            }
            j++;
        }
        return Math.max(max_count,current_count);
    }
}