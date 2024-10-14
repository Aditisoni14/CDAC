 import java.util.*;
 class primenum{
     static int prime(int num, int i)
     {
        if (i==1)
        return 1;
        if(num%1==0)
        return 0;
        return prime(num, i-1);
     }
    public static void main(String args[] ){
 
       int num,p;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter num ");
       num=sc.nextInt();
       p = prime(num, num/2);
       if (p==1)
       System.out.println("Prime");
       else 
       System.out.println("Not prime");
}
}