import java.util.Scanner;
public class Evenoddarray {
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
int i;
System.out.println(" ");
        System.out.print("EVEN ELEMENTS ARE = ");

    for( i=0; i<n ; i++)
    {
        if(a[i] % 2 == 0)
        {
            System.out.print(a[i]+" ");
    
            }    }
System.out.println(" ");
        System.out.print("ODD ELEMENTS ARE = ");

        for( i=0; i<n ; i++)
        {
            if(a[i] % 2 !=0)
            {
                System.out.print(a[i]+" ");
            
            }

        }
    

ob.close();
    
    }
    
}
