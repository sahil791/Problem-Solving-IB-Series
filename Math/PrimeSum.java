public class Solution {
    public ArrayList<Integer> primesum(int A) {
        int[] arr = new int[A+1];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2;i<A;i++){
            if(arr[i] == 0){
                for(int j=2*i;j<A;j+=i){
                    arr[j] = 1;
                }
            }
        }
        
        
        
        for (int i = 2; i < A; i++) 
        { 
            if (arr[i] == 0 && arr[A - i] == 0) 
            { 
                list.add(i);
                list.add(A-i);
                break;
            } 
        } 
        return list;
    }
}
