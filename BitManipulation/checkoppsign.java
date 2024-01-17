package BitManipulation;
//java program to check if the signs of two integers are opposite or not.
public class checkoppsign {
    public static void main(String args[]){
        int a=100,b=-50;
        if((a^b)<0){
            System.out.println("Opposite");
        }
        else{
            System.out.println("same");
        }
    }
}
