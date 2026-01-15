// Given an array of name of fruits you are supposed to sort it lexicograpical order using the selection sort  


public class SortingQuestion2 {

    static void ArrangeFruits(String arr[]){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int min_index = i ;
            for(int j = i + 1 ;j <  arr.length ; j++){
                if(arr[j].compareTo(arr[min_index]) < 0 ){
                    min_index = j ;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp ;
        }
    }


    public static void main(String[] args) {
        String fruit[] = {"Kiwi" , "Mango", "Apple" , "Orange", "Grapes"};
        
        ArrangeFruits(fruit);

        for(int i = 0 ; i < fruit.length ; i++){
            System.out.println(fruit[i]);
        }
    }
    
}
