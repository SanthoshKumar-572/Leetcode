class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int low=0;
        int high=numbers.length-1;
      //  int arr[]= new int[2];
        while(low<high){
            int sum=numbers[low]+numbers[high];
           
            if(sum==target){
                return new int[]{low+1,high+1};
               // arr[low,high];
            }
            if(sum<target){
                low++;
            }
            else{
                high--;
            }
        }
        return new int[]{};

    }
}