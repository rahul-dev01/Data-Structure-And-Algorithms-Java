// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

import java.util.*;

public class QuestionTwoSum {
    static int[] twoSum(int target , int[] arr){
        HashMap<Integer , Integer > myMap = new HashMap<>() ;
        for(int  i = 0 ; i < arr.length ; i++){
            int result = target - arr[i] ;
            
            if(myMap.containsKey(result)){
                return new int[] {myMap.get(result) , i }; 
            }
            myMap.put(arr[i], i) ; 
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int tar = 9 ; 
        System.out.println(Arrays.toString(twoSum(tar, arr)));
    }
}
