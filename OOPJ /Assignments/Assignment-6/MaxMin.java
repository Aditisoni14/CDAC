public class MaxMin {
    public static void main(String[] args) {
        int[] array = {4, 9, 6, 5, 2, 3};

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }
}