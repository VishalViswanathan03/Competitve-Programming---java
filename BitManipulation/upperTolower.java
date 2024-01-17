package BitManipulation;
import java.util.*;
public class upperTolower {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String lower="";

        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);  
            if(ascii>=65 && ascii<=90){
                ascii+=32;
            }
            lower=lower+(char)ascii;

        }
        System.out.println(lower);
        sc.close();
    }
}
