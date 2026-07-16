class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxpopulation=0;
        int answer=1950;

        for(int i=1950;i<=2050;i++){
            int count=0;
            for(int arr[]:logs){
                if(arr[0]<=i && i<arr[1]){
                    count++;
                }
            }
            if(count>maxpopulation){
                maxpopulation=count;
                answer=i;
            }
        }
        return answer;



    }
}