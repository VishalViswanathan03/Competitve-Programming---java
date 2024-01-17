package BitManipulation;
public class firstKprimes {
    // Java code to get the count of all integers up to n divisible by the first k primes.
    static int[] primes = {2, 3, 5, 7, 11, 13, 17, 23};

    public static void main(String[] args) {
        System.out.println(getDivisorsOfFirstKPrimes(2000237676786870L, 6));
    }

    static long getDivisorsOfFirstKPrimes(long n, int k) {
        long result = 0;
        for (int num = 1; num < (1 << k); num++) {
            long lcm = 1;
            int parity = 0;

            for (int bit = 0; bit < k; bit++) {
                if ((num >> bit & 1) == 1) {
                    lcm *= primes[bit];
                    parity++;
                }
            }

            long divisible = n / lcm;

            if (parity % 2 == 0) {
                result -= divisible;
            } else {
                result += divisible;
            }
        }
        return result;
    }
}
