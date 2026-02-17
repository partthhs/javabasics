import java.util.Scanner;
public class Transpose {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and coloumb =  ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int t[][] = new int[r][c];

        
        System.out.print("Enter the elements of matrice = ");
        for(int i = 0; i<r ; i++)
        {
            for(int j =0;j<c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("TRANSPOSE OF THE MATRICE IS = ");
        for(int i = 0; i<r ; i++)
        {
            for(int j =0;j<c; j++)
            {
                t[j][i] = a[i][j];
            }
        }

    System.out.println(" ");
        for(int i = 0; i<r ; i++)
        {
            for(int j =0;j<c; j++)
            {
                System.out.print(t[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
