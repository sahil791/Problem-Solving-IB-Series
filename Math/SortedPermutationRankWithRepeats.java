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
            HashMap<Character,Integer>map=new HashMap<>();
            
            for(int k=i;k<A.length();k++) {
                map.put(A.charAt(k),map.getOrDefault(A.charAt(k), 0)+1);
            }
            
            long d=1;
            
            for(int val:map.values()) {
                d=(d*factorial(val))%mod;
            }
            rank = (int) ((rank + ((count * factorial(A.length() - i - 1)) % mod)*power((int)d,mod-2)%mod) % mod);
        }
        
        return rank+1;
    }
    
    public static int factorial(int n){
        if(n<=1) return 1;
        return ((n)%mod*(factorial(n-1))%mod)%mod;
    }
    
    public long power(long a,long b){
        if(a==0) return 0;
        if(b==0) return 1;
        long result=0;
        if(b%2==0){
            result = power(a,b/2);
            result = (result * result) % mod;
        }else{
            result = a % mod;
            result = ((result%mod) * power(a,b-1) % mod)%mod;
        }
        
        return result % mod;
    }
}
