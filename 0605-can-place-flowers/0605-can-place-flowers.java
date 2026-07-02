class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int count=0;
        if(l==1 && flowerbed[0]==0){
            count++;
        }
        if(l!=1 && flowerbed[0]==0 && flowerbed[1]==0){
            count++;
            flowerbed[0]=1;
        }
        for(int i=1;i<l-1;i++){
            if(flowerbed[i]==0 && (flowerbed[i+1]==0 && flowerbed[i-1]==0)){
                count++;
                flowerbed[i]=1;
            }
        }
        if(l!=1 && flowerbed[l-1]==0 && flowerbed[l-2]==0){
            count++;
            flowerbed[l-1]=1;
        }
        if(count>=n){
            return true;
        }
        return false;
    }
}