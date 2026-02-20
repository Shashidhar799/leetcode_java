class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int digitSum=0;
        int elementSum=0;
        for(int num:nums){
            elementSum+=num;

            int temp=num;
            while(temp>0){
                digitSum+=temp%10;
                temp/=10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}