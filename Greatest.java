package JAVA2;
import java.util.Scanner;
class Greatest
{
    public static void main(String[]args)
    {
Scanner ob=new Scanner(System.in);
        System.out.println("Enter two numbers=");
        int a=ob.nextInt();
        int b=ob.nextInt();
        int result=(a>b)?a:b;
        System.out.println("Greatest number="+result);
        ob.close();
    }
}
