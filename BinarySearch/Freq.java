package BinarySearch;

public class Freq {
    static int lowerBound(int a[], int n, int x) {
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x <= a[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    static int upperBound(int a[], int n, int x) {
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x < a[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String args[]) {
        int[] arr = {1, 1, 2, 3, 4, 5, 5, 6};
        System.out.println(upperBound(arr, arr.length, 5) - lowerBound(arr, arr.length, 5));
    }
}

