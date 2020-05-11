public class Solution {
    public static final int mod = 1000003;
    public int findRank(String A) {
        int count=0,rank=0;
        for(int i=0;i<A.length();i++){
            count=0;
            for(int j=i+1;j<A.length();j++){
                if(A.charAt(j) < A.charAt(i)){
                    count++;
                }
            }
            rank = ((rank)%mod + (count)%mod * ((factorial(A.length()-i-1)))%mod)%mod;   
        }
        
        return rank+1;
    }
    
    public static int factorial(int n){
        if(n<=1) return 1;
        return ((n)%mod*(factorial(n-1))%mod)%mod;
    }
}
