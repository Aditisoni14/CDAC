
import java.util.* ;
class pattern{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); 
        int m= sc.nextInt();
        for(int i=1; i<=n ; i++){   //for the lines 4
            for(int j=1; j<=m ; j++){      //inner loop for no. of star print in a line 5
                System.out.print("*"); // print in a same line
            }
            System.out.println();// after 5 start print in next line 
        }
    }
}//out put should be 
//***** 
//***** 
//***** 
//***** 
