class Selectionsort{
    static void ssort(int arr1[])
    {
        int n= arr1.length;
        for(int i=0; i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
        {
            if(arr1[j] < arr1[min])
            min=j;
        }
        //swaping of min element with first element 
        int temp = arr1[min];
        arr1[min] = arr1[i];
        arr1[i] = temp;
    }
}
static void display(int arr1[])
{
    for(int i=0; i<arr1.length;i++)
    {
        System.out.print(arr1[i]+" ");
    }
}
public static void main(String args[])
{
    int arr1[] ={2,13,24,56,45,9,30};
    display(arr1);
    System.out.println();
    ssort(arr1);
    display(arr1); 
}
}