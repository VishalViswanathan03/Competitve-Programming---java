package BitManipulation;
import java.util.*;

public class DecimaltoBinary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Integer.toBinaryString(a));
        sc.close();
    }
}