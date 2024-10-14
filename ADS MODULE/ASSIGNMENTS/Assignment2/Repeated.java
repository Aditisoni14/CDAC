class Repeated {
    
    public static void main(String[] args) {
    String str = new String("programming");
    int count=0;
    char[] ch = str.toCharArray();
    System.out.println("repeated characters in String are : "); 

    for (int i=0; i<ch.length; i++)
     {  
    for (int j=i+1; j<ch.length; j++) 
    {
    
    if(ch[i]==ch[j]) {
    
    System.out.print(ch[j]+" "); 
    count++;
    }
    }
        
    }
System.out.println();

 System.out.println("repeated characters count: " +count);
}
}