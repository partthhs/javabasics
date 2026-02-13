import java.util.Scanner;
public class Integerarray {
    public static void main(String[]args)
    {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the number of elements = ");
        int n = ob.nextInt();
        double sum = 0;

        int a[] = new int[n];
        System.out.print("Enter the elements = ");
        for(int i=0 ; i<n; i++)
        {
            a[i] = ob.nextInt();

            sum = sum + a[i];
        }
        double avg = sum/n;
        System.out.println(" ");
        System.out.println("The average of the numbers is = "+avg);

        for(int i = 0;i<n ; i++)
        {
            if(a[i] > avg)
            {
                System.out.println("  ");
                System.out.println("The integers that are greater than average of all integers are = "+a[i]);
            }
        }
        ob.close();
    }
    
}
