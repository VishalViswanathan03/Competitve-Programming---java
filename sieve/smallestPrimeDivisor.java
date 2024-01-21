package sieve;
import java.util.*;

public class smallestPrimeDivisor {
    static int n = 1000001;
    static int smallest_prime_divisor[] = new int[n];

    static void sieve() {
        for (int i = 2; i < n; i++) {
                for (int j = i; j < n; j += i) {
                    if (smallest_prime_divisor[j] == 0) {
                        smallest_prime_divisor[j] = i;
                    }
                
            }
        }
    }

    public static void main(String args[]) {
        sieve();
        for (int i = 2; i < 100; i++) {
            System.out.println(i + " " + smallest_prime_divisor[i] + "\n");
        }
    }
}
