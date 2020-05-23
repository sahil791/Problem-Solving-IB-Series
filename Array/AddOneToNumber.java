public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int carry = 1;
        
        for(int i=A.size()-1;i>=0;i--){
            int curr = carry+A.get(i);
            carry = curr/10;
            temp.add(curr%10);
        }
        if(carry>0)
            temp.add(carry);
            
        int len = temp.size();
        
        while(true){
            if(temp.get(len-1) == 0 ){
                len--;
            }else{
                break;
            }
        }
        
        for(int i=len-1;i>=0;i--){
            result.add(temp.get(i));
        }
        return result;
    }
}
