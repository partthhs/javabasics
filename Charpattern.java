package javabasics;
import java.util.Scanner;
public class Charpattern {
    
public static void main(String[]args)
{
    Scanner ob=new Scanner(System.in);
    System.out.print("iEnter the number of rows=");
    int num=ob.nextInt();
    char ch= 'A';
    for(int i=1;i<=num;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(""+ch);ch++;
        }
        System.out.println();

    }
    ob.close();
}
    
}

    


