import java.util.Scanner;
public class Weightconverter {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double weight;
        double newweight;
        int choice;

        System.out.println("WEIGHT CONVERSION PROGRAM");
        System.out.println("1. Convert lbs to kg");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Choose an option=");
        choice = sc.nextInt();


    if(choice==1){
        System.out.print("Enter the weight in lbs=");
        weight =sc.nextDouble();
        newweight=weight*0.453592;
        System.out.print("The new weight in kgs is = "+newweight);
    }
    else if(choice ==2){
        System.out.print("Enter the weight in kgs = ");
        weight =sc.nextDouble();
        newweight=weight*2.20462;
        System.out.print("The new weight in lbs is = "+newweight);
 }
 else{
    System.out.println("Invalid choice");
 }
 sc.close();
    }
    
}
