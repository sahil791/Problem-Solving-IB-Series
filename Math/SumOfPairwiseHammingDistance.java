public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        int hammingDistanceSum=0;
        
        for(int i=0;i<32;i++){
            int countSetBits=0,countUnsetBits=0;
            for(int j=0;j<A.size();j++){
                if((A.get(j) & (1<<i)) > 0){
                    countSetBits++;
                }else{
                    countUnsetBits++;
                }
            }
            hammingDistanceSum += (2L * (long)countSetBits * (long)countUnsetBits) % 1000000007;
            hammingDistanceSum = hammingDistanceSum % 1000000007;
        }
        
        return hammingDistanceSum;
    }
}
