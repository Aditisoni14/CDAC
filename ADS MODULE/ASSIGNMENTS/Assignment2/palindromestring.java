public class  palindromestring {
    public static boolean ispalindrome(String str) {
        int left = 0; 
        int right = str.length() - 1; 

        while (left < right) { 
            if (str.charAt(left) != str.charAt(right)) { 
                return false;
            }
            left++; 
            right--; 
        }
        return true; 
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(ispalindrome("madam")); // true
        System.out.println(ispalindrome("hello")); // false
      
    }
} 