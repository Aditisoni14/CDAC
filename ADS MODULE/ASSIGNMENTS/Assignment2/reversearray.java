import java.util.*;
class reversearray { 
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
    
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp; 
            // Move towards the center
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4};
        reverseArray(arr1);
        System.out.println(Arrays.toString(arr1)); // [4, 3, 2, 1]
        
        int[] arr2 = {7, 8, 9};
        reverseArray(arr2);
        System.out.println(Arrays.toString(arr2)); // [9, 8, 7]
    }
}