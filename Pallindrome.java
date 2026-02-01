package JAVA2;
import java.util.Scanner;
class Pallindrome
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number=");
        int num=ob.nextInt();
        int original=num;
        int rev=0, digit;
        while(num>0){
            digit=num%10;
            num=num/10;
            rev=rev*10+digit;
        }
        if(original==rev){
            System.out.println("Number is pallindrome");
        }else{
                System.out.println("Number is not pallindrome");
                ob.close();
            }
        }
        
    }

