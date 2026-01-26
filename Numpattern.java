package javabasics;
import java.util.Scanner;

public class Numpattern {
    public static void main(String[]args)
{
    Scanner ob=new Scanner(System.in);
    System.out.print("Enter the number of rows=");
    int num=ob.nextInt();
    int n=1;
    for(int i=1;i<=num;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(n+"");n++;
        }
        System.out.println();

    }
    ob.close();
}
    
}


