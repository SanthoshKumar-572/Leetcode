class Solution {
    public int findMiddleIndex(int[] nums) {
       // int n=nums.length;
       int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];

        }
        int ls =0;
        for(int i=0;i<nums.length;i++){
            
            int rs = total-nums[i]-ls;
            if(rs==ls){
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
    
}