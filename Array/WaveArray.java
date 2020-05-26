public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i=0;i<A.size()-1;i++){
            res.add(A.get(i+1));
            res.add(A.get(i));
            i++;
        }
        if(A.size()%2==1) res.add(A.get(A.size()-1));
        return res;
    }
}
