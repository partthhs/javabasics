import java.util.Scanner;
public class Sumofdiagonal{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and coloumb = ");
        int r = sc.nextInt();
        int c =sc.nextInt();

        int a[][] = new int[r][c];

        System.out.print("Enter matrix elements = ");
        System.out.println("  ");
        for(int i = 0;i<r ; i++)
        {
for(int j=0;j<c;j++)
{
a[i][j] = sc.nextInt();
}
        }

        int sum =0;
        if(r==c){
for(int i=0;i<r;i++)
{
   for(int j=0;j<c;j++)
   {
    if(i==j)
    {
        sum = sum +a[i][j];
    }
   }
}}
                System.out.println("Sum of diagonal elements is = "+sum);
        sc.close();

    
    }


}
