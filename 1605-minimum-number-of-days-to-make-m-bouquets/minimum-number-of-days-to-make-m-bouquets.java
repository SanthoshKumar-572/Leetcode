class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n) return -1;
        int low=Min(bloomDay);
        int high=max(bloomDay);
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ispossible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int  Min(int arr[]){
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static int max(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static Boolean ispossible(int arr[],int mid,int m,int k ){

        int count=0;
        int noofbo=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                noofbo+=(count/k);
                count=0;
            }
        }
        noofbo+=(count/k);
        if(noofbo>=m){
            return true;
        }
        return false;
    }
}