public class RemoveDuplicates {
    public static int remove(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 0; 
        for (int j = i+1; j < arr.length; j++) { 
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // new length of array
    }
    public static void main(String[] args) {
        int[] arr1 = { 2,2};
        int[] arr2 = {0, 0, 1, 1, 2, 2, 3 };

        System.out.println("New length of arr1: " + remove(arr1));
        System.out.println("New length of arr2: " + remove(arr2));
    }
}