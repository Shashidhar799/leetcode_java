class Solution {
    public int largestAltitude(int[] gain) {
        int l=gain.length;
        int alt=0;
        int arr[] = new int[l+1];
        arr[0]=0;
        for(int i=0;i<l;i++){
            alt+=gain[i];
            arr[i+1]=alt;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}