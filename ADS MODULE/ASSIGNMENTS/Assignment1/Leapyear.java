public class Leapyear {
    public static boolean isLeapYear(int year) {
       if(year % 4 == 0 || year % 400 == 0) {  
        return true;
       }
       else {
        return false;
       }
    }
    public static void main(String[] args) {
        int year = 1995;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }
}