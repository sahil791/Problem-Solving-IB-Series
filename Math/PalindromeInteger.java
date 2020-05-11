public class Solution {
    public int isPalindrome(int A) {
        String s = ""+A;
        StringBuffer sb = new StringBuffer(""+A);
        sb.reverse();
        if(s.equals(sb.toString())) return 1;
        return 0;
    }
}
