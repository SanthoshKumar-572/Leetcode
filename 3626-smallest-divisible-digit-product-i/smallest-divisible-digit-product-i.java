class Solution {
    public int smallestNumber(int n, int t) {
       
       while(digit(n)%t !=0){
         n++;
       }
       return n;
       
       
    }
    public static int digit(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*digit(n/10);
    }
}