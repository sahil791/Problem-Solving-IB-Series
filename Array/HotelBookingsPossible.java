public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        ArrayList<Integer> tempA = new ArrayList<Integer>();
        ArrayList<Integer> tempB = new ArrayList<Integer>();
        
        // temp = (ArrayList<Integer>) A.clone();
        // Collections.sort(temp);
        
        // for(int i=0;i<temp.size();i++){
        //     int b = A.get(i);
        // }
        
        // for(int i=0;i<arrive.size()-1;i++){
        //     for(int j=i+1;j<depart.size();j++){
        //         if(arrive.get(i)>arrive.get(j)){
                    
        //             // sorting by arrival time.
        //             int temp = arrive.get(i);
        //             arrive.set(i,arrive.get(j));
        //             arrive.set(j,temp);
                    
        //             // placing values according to departure time.
        //             temp = depart.get(i);
        //             depart.set(i,depart.get(j));
        //             depart.set(j,temp);
        //         }
        //     }
        // }
        
        //  System.out.println(arrive);
        //  System.out.println(depart);
        // int count=1;
        // for(int i=0;i<arrive.size()-1;i++){
        //     if(depart.get(i)>arrive.get(i+1)){
        //         count++;
        //     }
        // }
        // System.out.println("count - "+count);
        // return count<=K?true:false;
        // //return true;
        int i=1,j=0,count=1;
        Collections.sort(arrive);
        Collections.sort(depart);
        
        while(i<arrive.size() && j<depart.size()){
            if(arrive.get(i)<depart.get(j)){
                count++;
                i++;
                if(count>K){
                    return false;
                }
            }else{
                count--;
                j++;
            }
            
        }
        return true;
    }
}
