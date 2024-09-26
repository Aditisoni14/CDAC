import java.util.Scanner;

public class Program {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int[] array = new int[5];

        // Print default values
        System.out.println("Default values of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }
        System.out.println();

        // Accept records from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Print updated values
        System.out.println("Updated values of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }
        System.out.println();
    }
}
