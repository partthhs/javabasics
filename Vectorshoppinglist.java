import java.util.Scanner;
import java.util.Vector;
public class Vectorshoppinglist 
{
public static void main(String[]args)
{
    Vector <String> List = new Vector <String>();

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 5 items for your shopping list =");
    for(int i = 0 ; i<5 ; i++)
    {
        String str = sc.next();
        List.add(str);
    }

    System.out.println("Shopping list = "+List);
    }
}

    

