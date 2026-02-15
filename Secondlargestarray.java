import java.util.Scanner;
public class Secondlargestarray {

    public static void main(String[]args){
        Scanner ob = new Scanner(System.in);

    
        System.out.print("Enter size = ");
        int n = ob.nextInt();

        int a[] = new int[n];

        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Enter the elements = ");
            a[i] = ob.nextInt();
        }
        int Largest, secondLargest;

        if(a[0] > a[1])
        {
            Largest = a[0];
            secondLargest = a[1];
        }
else {
    Largest = a[1];
    secondLargest =a[0];
}
for(int i = 2 ; i<n ;i++)
{
    if(a[i]>Largest)
    {
        secondLargest = Largest;
        Largest = a[i];
    }
    else if(a[i]>secondLargest && a[i] != Largest)
    {
        secondLargest = a[i];
    }
    
}
System.out.println("Second Largest element = "+secondLargest);

ob.close();
        
}
    }
    

