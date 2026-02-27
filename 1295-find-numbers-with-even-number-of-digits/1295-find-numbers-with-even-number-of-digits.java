class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int num:nums){
            int temp=num;
            int count=0;
            while(temp>0){
                temp/=10;
                count++;
            }
            if(count%2==0){
                res++;
            }
        }
        return res;
    }
}