class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer>ans=new HashSet<>();
       // int val=0;
        for(int i:nums){
            if(ans.contains(i)){
                return i;
            }
            ans.add(i);

        }
        return -1;
    }
}