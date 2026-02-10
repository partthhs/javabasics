import java.util.Scanner;
public class Factrecurrsion {
    static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else 
        {
            return n*factorial(n-1);
        }}
        public static void main(String[]args)
        {
            Scanner ob = new Scanner(System.in);

            System.out.print("Enter number = ");
            int n = ob.nextInt();

            System.out.println("Factorial of number is = "+ factorial(n));
ob.close();
        }
    
}
