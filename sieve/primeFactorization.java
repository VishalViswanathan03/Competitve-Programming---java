package sieve;

public class primeFactorization {

    static int n=1000001;
    static int[] smallestPrime=new int[n];
    private static void sieve(){

        for(int i=2;i<n;i++){
            for(int j=i;j<n;j++){
                if(smallestPrime[i]==0){
                    smallestPrime[j]=i;
                }
            }
        }

    }
    public static void main(String args[]){

        
        for(int i=0;i<100;i++){
            System.out.println(i+" "+smallestPrime[i]);
        }

    }
}
