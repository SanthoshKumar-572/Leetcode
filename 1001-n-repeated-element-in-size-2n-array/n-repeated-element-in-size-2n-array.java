class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>ans=new HashMap<>();
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(ans.containsKey(nums[i])){
                val=nums[i];
            }
            ans.put(nums[i],i);
        }
        return val;
    }
}