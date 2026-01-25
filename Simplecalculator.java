package javabasics;
import java.util.Scanner;
public class Simplecalculator {
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("SIMPLE CALCULATOR");
        System.out.print("Enter the numbers=");
        int n1=ob.nextInt();
        int n2=ob.nextInt();
System.out.println("Enter the operator\n 1.+\n 2. -\n 3. *\n 4. /\n 5. %\n");
int operator = ob.nextInt();
double result;
switch (operator){
    case 1:
        result = n1+n2;
        break;
        case 2:
            result = n1-n2;
            break;
            case 3:
                result= n1*n2;
                break;
                case 4:
                    if (n2==0){
                        System.out.println("Division by zero is not possible ");
                        return;
                    }
                    result= n1/n2;
                    break;
                    case 5:
                    if (n2==0){
                        System.out.println("Modulus of zero is not allowed");
                        return;
                    }
                    result= n1%n2;
                    break;
                    default:
                        System.out.println("Invalid Operator");
                        return;
                    }
                    System.out.print("The Answer is");
                    System.out.print("="+result);
                    ob.close();
}
    }
    


