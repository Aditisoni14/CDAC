import java.util.*;
 public class Amstnum {
    static int arm(int n)
    {
        if(n<10)
        return n*n*n;
        return (n%10)*(n%10)*(n%10)+arm(n/10);
    }
public static void main(String args[] ) {

    int num,r;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num");
    num=sc.nextInt();
    r=arm(num);
    if(num==r)
    System.out.println(num+" TRUE");
    else
    System.out.println(num+" False");
}
 }
