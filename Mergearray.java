import java.util.Scanner;
public class Mergearray {
    public static void main(String[]args)
    {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the size of 1st array = ");
        int n = ob.nextInt();

        int a1[] = new int[n];

        System.out.println("Enter the elements of 1st array = ");
        for(int i=0 ; i<n ; i++)
        {
            a1[i] = ob.nextInt();
        }
        System.out.println("Enter the size of 2nd array = ");
        int m = ob.nextInt();

        int a2[] = new int[m];

        System.out.println("Enter the elements of 2nd array = ");
        for(int i=0 ; i<m; i++)
        {
            a2[i] = ob.nextInt();
        }

        int[] merg = new int[n+ m];

        for(int i = 0 ; i<n;i++)
        {
            merg[i] = a1[i];
        }

        for(int i=0; i<m ; i++)
        {
            merg[n + i] = a2[i];
        }

        System.out.println("Merged array is = ");
        for(int i = 0; i<merg.length; i++)
        {
            System.out.print(" " +merg[i]);
        }
        ob.close();
    }
    
}
