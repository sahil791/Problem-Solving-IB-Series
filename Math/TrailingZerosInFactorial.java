public class Solution {
    public int trailingZeroes(int A) {
        int ans=0;
        
        while(A>0){
            int n = A/5;
            ans = ans + n;
            A/=5;
        }
        return ans;
    }
}
