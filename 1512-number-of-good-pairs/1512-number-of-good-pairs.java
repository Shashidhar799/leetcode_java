class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int goodPairs=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j && nums[i]==nums[j]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}