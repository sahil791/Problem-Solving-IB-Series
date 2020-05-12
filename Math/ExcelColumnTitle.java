public class Solution {
    public String convertToTitle(int n) {
        String result = "";
        
        while(n>0){
            n--;
            int r = n%26 + 65;
            char c = (char) r;
            result = c +""+result;
            n/=26;
        }
        return result;
    }
}
