public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int n = A.size();
        int ans = A.get(0),curr = A.get(0);
        
        for(int i=1;i<n;i++){
            curr = Math.max(A.get(i),A.get(i)+curr);
            ans = Math.max(curr,ans);
        }
        return ans;
    }
}
