import java.util.HashMap;

public class QuentionFrequencyOfElement {

    static int checkMaxFreq(HashMap<Integer , Integer> freqMap){
        int mxFreq = 0, ans = -1 ;
        for(var e : freqMap.entrySet()){
            if(e.getValue() > mxFreq){
                mxFreq = e.getValue();
                ans = e.getKey();
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,2,1,4,4,1,4};
    
        HashMap<Integer , Integer > mymap = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(!mymap.containsKey(arr[i])){
                mymap.put(arr[i], 1);
            }
            else{
                mymap.put(arr[i], mymap.get(arr[i]) + 1);
            }
        }

        System.out.println(checkMaxFreq(mymap));

        System.out.println(mymap.entrySet());
    }
}
