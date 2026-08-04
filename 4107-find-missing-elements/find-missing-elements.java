class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        int sma=arr[0];
        int lar=arr[n-1];
        int index=0;
        for(int i=sma;i<lar;i++){
            if(arr[index]==i){
                index++;
            }  
            else if(arr[index]>i){
                ans.add(i);
            }  
        }
        return ans;

    }
}