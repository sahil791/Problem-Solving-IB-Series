public class Solution {
    public int titleToNumber(String A) {
        int base = 1;
        int ans = 0;
        
        for(int i = A.length()-1;i>=0;i--){
            int val = A.charAt(i) - 'A' + 1;
            ans = ans+base*val;
            base = base * 26;
        }
        return ans;
    }
}
