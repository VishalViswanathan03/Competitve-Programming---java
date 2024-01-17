package BitManipulation;
public class Question2oddoccur {
    public static void main(String args[]){
        int[] a = {4, 2, 8, 6, 7, 3, 9, 4, 2, 6, 3, 7};
        int xor=0;
        for(int i:a){
            xor^=i;
        }

        int first=0;
        int second=0;

        int x=1;
        while((xor&x)==0){
            x<<=1;
        }
        for(int i:a){
            if((i&x)==0){
                first^=i;
            }
            else{
                second^=i;
            }
        }
        System.out.println(first+" "+second );
    }
}
