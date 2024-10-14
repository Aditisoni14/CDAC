public class palindrom {

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
    public static void main(String[] args) {
        int num = 121; 
        System.out.println(num + " is a palindrome: " + isPalindrome(num));
    }
} 
