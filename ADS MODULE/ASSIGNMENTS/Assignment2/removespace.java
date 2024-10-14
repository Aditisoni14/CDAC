class removespace{
    public static void main(String[] Args )
    {
        String str1="Hello World";
        str1=str1.replaceAll("\\s+","");
        System.out.println(str1);
        String str2="programing language";
        str2=str2.replaceAll("\\s+","");
        System.out.println(str2);
    }
}