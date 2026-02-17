import java.util.Scanner;
public class AddDarray {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and coloumbs = ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int re[][] = new int[r][c];


        System.out.println("Enter the elements of A = ");
        for(int i = 0; i<r ; i++)
        {
            for(int j = 0; j<c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for B = ");
        for(int i=0;i<r ; i++)
        {
            for(int j =0; j<c; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
System.out.println("Sum of two matrices is ");
for(int i = 0; i<r ; i++)
        {
            for(int j = 0; j<c; j++)
            {
                re[i][j] = a[i][j] + b[i][j];
            }
        }
System.out.println("Resultant Matrice =  ");
for(int i = 0; i<r ; i++)
        {
            for(int j = 0; j<c; j++)
            {
                System.out.print(re[i][j] + " ");
            }
            System.out.println();
        }

sc.close();

    }
    
}
