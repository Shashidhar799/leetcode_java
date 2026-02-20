class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i=0;i<n;i+=2){
            arr[i]=nums[i];
        }
        for(int i=1;i<n;i+=2){
            arr[i]=nums[n+]
        }
        return arr;
    }
}