class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>ans=new ArrayList<>();
        while(n>0){
            int temp=n%10;
            ans.add(temp);
            n=n/10;
        }
        Collections.sort(ans);
        int max=ans.size();
        return ans.get(max-1)*ans.get(max-2);

        
    }
}