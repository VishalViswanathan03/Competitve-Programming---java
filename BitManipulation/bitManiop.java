package BitManipulation;
public class bitManiop {
    public static void main(String args[]){
        bitManiop bitOp = new bitManiop();

        // Example values
        int num = 25;
        int k = 3;

        // Turn off kth bit
        int turnedOffNum = bitOp.turnOffKthbit(num, k);
        System.out.println("After turning off the " + k + "th bit: " + turnedOffNum);

        // Turn on kth bit
        int turnedOnNum = bitOp.turnOnKthbit(num, k);
        System.out.println("After turning on the " + k + "th bit: " + turnedOnNum);

        // Check if kth bit is set
        boolean isKthBitSet = bitOp.kthset(num, k);
        System.out.println("Is the " + k + "th bit set? " + isKthBitSet);

        // Toggle kth bit
        int toggledNum = bitOp.toggleKthBit(num, k);
        System.out.println("After toggling the " + k + "th bit: " + toggledNum);

        // Unset rightmost set bit
        int unsetRightMostBitNum = bitOp.unsetRightMostSetBit(num);
        System.out.println("After unsetting the rightmost set bit: " + unsetRightMostBitNum);

        // Check if the number is a power of 2
        boolean isPowerOf2 = bitOp.powerOf2(num);
        System.out.println("Is the number a power of 2? " + isPowerOf2);

        // Count the number of set bits
        int setBitsCount = bitOp.countbit(num);
        System.out.println("Number of set bits: " + setBitsCount);

        // Count the number of set bits (optimized)
        int setBitsCountOptimized = bitOp.countbitOptimised(num);
        System.out.println("Number of set bits (optimized): " + setBitsCountOptimized);

        // Find power of a number
        int base = 2;
        int exponent = 5;
        int powerResult = bitOp.findPower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + ": " + powerResult);

        // Multiply two numbers
        int num1 = 7;
        int num2 = 4;
        int multiplicationResult = bitOp.multiply(num1, num2);
        System.out.println("Multiplication of " + num1 + " and " + num2 + ": " + multiplicationResult);
  
    }
    public int turnOffKthbit(int a,int k){
        return (a&~(1<<k));
    }
    public int turnOnKthbit(int a,int k){
        return(a|(1<<k));
    }
    boolean kthset(int a,int k){
        if((a&(~(1<<k)))>0){
            return true;
        }
        else{
            return false;
        }
    }
    int toggleKthBit(int a,int k){
        return a^(1<<k);
    }
    int unsetRightMostSetBit(int a){
        return a&(a-1);
    }

    boolean powerOf2(int a){
        if((a&(a-1))==0){
            return true;
        }
        else{
            return false;
        }
    }
    int countbit(int a){
        int count=0;
        for(int i=0;i<32;i++){
            if((a&(1<<i))!=0){
                count++;
            }
        }
        return count;
    }
    int countbitOptimised(int a){
        int count = 0;
        while (a > 0) {
            count++;
            a &= (a - 1);
        }
        return count;
        }
    int findPower(int a,int b){
        int res=1;
        while(b>0){
            if((b&1)!=0){
            res=res*a;}
        
        b>>=1;
        a=a*a;

        }return res;
    }
    
    int multiply(int a,int b){
        int res=0;
        while(b>0){
            if((b&1)==1){
                res=res+a;
            }
            b=b>>1;
            a=2*a;
        }
        return res;
    }
}
