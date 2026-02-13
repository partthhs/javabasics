import java.util.Scanner;
public class Reversearray {
    public static void main(String[]args)
    {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the size of array = ");
    int n = ob.nextInt();

        int a[] = new int [n] ;

System.out.print("Enter the elements = ");

        for(int i = 0 ; i<n ; i++)
        {
            a[i] = ob.nextInt();
        }
        System.out.println(" ");
System.out.print("Reverse array is = ");

for( int i= n-1 ; i>=0 ; i--)
{
    System.out.print(a[i]+ " ");
}
ob.close();
    }}