package BitManipulation;
//Aray with all numbers occuring even number of time except one. Find the one using bit manipulation.
import java.util.*;
public class QuestionOneoddInArray {
    public static void main(String args[]){
        int[] arr={1,2,3,3,2,3,1};
        System.out.println("Using mod and hashMap: \n");
        usingmod(arr);
        System.out.println("Without using mod:\n ");
        int result=0;
        for(int i:arr){
            result^=i;
        }
        System.out.println(result);


    }
    static void usingmod(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i:hm.keySet()){
            if(i%2!=0){
                System.out.println(hm.get(i));
            }
        }
    }
}
