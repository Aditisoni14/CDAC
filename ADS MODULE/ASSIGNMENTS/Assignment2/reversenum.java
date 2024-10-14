public class reversenum {
    public static int reverseNumber(int num) {
        int sign = (num < 0) ? -1 : 1;
        num = Math.abs(num); 
        int reversedNum = 0; 
        while (num > 0) { 
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit; 
            num /= 10; 
        }
        return sign * reversedNum;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseNumber(12345)); // 54321
        System.out.println(reverseNumber(-9876)); // -6789
    }
}  