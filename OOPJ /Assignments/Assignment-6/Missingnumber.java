public class Missingnumber {
    public static int findMissingNumber(int a[], int n) {
        int sum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i = 0; i < a.length; i++) {
            arraySum += a[i];
        }

        return sum - arraySum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5};
        int n = 5;

        System.out.println("Missing number is " + findMissingNumber(a, n));
    }
}
