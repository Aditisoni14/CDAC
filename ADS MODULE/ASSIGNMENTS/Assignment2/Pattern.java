
public class Pattern {
   public static void main(String args[]) {
       int n = 5 ; // for 3 also
      
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
                   System.out.print("*");
           }
           System.out.println();
       }
   }
}

// for right  reverse pyramid 
//for(i=n; i<=1;i--)
//for(j=1;j<=i;j++)

// for left reverse pyramid 
//outerloopforRow for(i=n; i>=1; i--)  , innerloopforspace for() 