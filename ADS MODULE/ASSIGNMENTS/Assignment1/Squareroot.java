import java.util.Scanner;

public class Squareroot {

    public static int sqrt(int x, int i) {
        if (i * i == x) {
            return i;
        } else if (i * i > x) {
            return i - 1;
        } else {
            return sqrt(x, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("Square Root of " + x + ": " + sqrt(x, 1));
    }
}