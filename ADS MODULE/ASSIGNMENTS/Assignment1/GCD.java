import java.util.*;

public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" first number: ");
        int a = scanner.nextInt();

        System.out.print(" second number: ");
        int b = scanner.nextInt();

        System.out.println("GCD of " + a + " and " + b + "- " + gcd(a, b));
    }
}