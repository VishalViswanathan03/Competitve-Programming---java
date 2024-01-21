package sieve;

public class primes {
    public static void main(String args[]){
        boolean[] isPrime=sieveoferastosthenes(5);
        

    }

    static boolean[] sieveoferastosthenes(int n){
        boolean[] isPrime=new boolean[n+1];

        for(int i=0;i<n;i++){
            isPrime[i]=true;
        }
        isPrime[0]=isPrime[1]=false;

        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        return isPrime;

    }
}
