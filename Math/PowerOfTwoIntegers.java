public class Solution {
    public int isPower(int A) {
        if(A==1) return 1;
        for(int i=1;i<A;i++){
            boolean d = (Math.log10(A)/Math.log10(i))%1==0;
            if(d) return 1;
        }
        return 0;
    }
}
