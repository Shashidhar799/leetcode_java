class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int water=0;
        int maxWater=0;
        int left=0;
        int right=n-1;
        while(left<=right){
            water=Math.min(height[left],height[right])*(right-left);
            maxWater=Math.max(water,maxWater);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}