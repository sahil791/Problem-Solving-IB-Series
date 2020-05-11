public class Solution {
    public int cpFact(int A, int B) {
        if(findGCD(A,B) == 1) return A;
        int gcd = findGCD(A,B);
        while(gcd != 1){
            A = A/findGCD(A,B);
            gcd = findGCD(A,B);
        }
        return A;
    }
    
    public static int findGCD(int b,int i){
        if(b == 0) return i;
        if(i == 0) return b;
        
        return findGCD(i%b,b);
    }
}
