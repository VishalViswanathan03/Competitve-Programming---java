package BinarySearch;
import java.util.*;
public class Hashing {
    public static void main(String args[]){
    HashMap<Integer,Integer> hm=new HashMap<>();
    int[] arr={1,1,2,2,2,3,3,4,5};
    for(int i=0;i<arr.length;i++){
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
    }

    for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        System.out.println(entry.getKey()+" : "+entry.getValue());
    }
}}
