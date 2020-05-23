public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int t=0;
        for(int i=1;i<A.size();i++){
            int x = Math.abs(A.get(i-1)-A.get(i));
            int y = Math.abs(B.get(i-1)-B.get(i));
            t+=Math.abs(x-y)+Math.min(x,y);
        }
        return t;
    }
}
