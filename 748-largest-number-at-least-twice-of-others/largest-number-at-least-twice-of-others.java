class Solution {
    public int dominantIndex(int[] nums) {
        int lar=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[lar]){
                lar=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=lar && nums[lar]<2*nums[i]){
                return -1;
            }
        }
        return lar;
    }
}