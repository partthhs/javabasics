package javabasics;

import java.util.Scanner;
class Prime
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("PRIME NUMBER CHECKER");
        System.out.print("Enter a number=");
        int num=ob.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }}
            if(count==2)
            {
                System.out.println("Entered Number is prime");
            }
            
           else{
                
                System.out.println("Entered Number is not prime");}

                ob.close();
        
    }
}


