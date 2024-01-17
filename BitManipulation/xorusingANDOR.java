package BitManipulation;
public class xorusingANDOR {
    public static void main(String args[]){
        int a=5;
        int b=6;
        System.out.println("Without using ^: "+((a|b)-(a&b)));
        System.out.println("Using ^: "+(a^b));
    }
}
