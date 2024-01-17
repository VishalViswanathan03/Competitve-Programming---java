package BitManipulation;
import java.util.*;

public class generateSubsets {
    public static void main(String args[]){
        
        ArrayList<String> a=new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        subsets(a);
        
    }

    static void subsets(ArrayList<String> a){

        int n=a.size();

        for(int i=0;i<(1<<n);i++){
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    System.out.print(a.get(j));
                }
            }
            System.out.println();
        }
    }
}
