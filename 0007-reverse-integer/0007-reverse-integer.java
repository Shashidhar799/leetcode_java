class Solution {
    public int reverse(int x) {
        int res=0;
        int t2=x;
        if(x<0){
            x=x*(-1);
        }
        while(x>0){
            int l=x%10;
            if (res > (Integer.MAX_VALUE - l) / 10) {
                return 0;  
            }
            res=(res*10)+l;
            x/=10;
        }
        
        if(t2<0){
            return res*(-1);
        }
        
        return res;
    }
}