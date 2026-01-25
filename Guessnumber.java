import java.util.Scanner;
class Guess {
 public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int number = 1+(int)(100*Math.random());
        int j=5;
        boolean guessed=false;
        System.out.println("You have" + j +"attemps to guess the number");
        for(int i=0;i<j;i++)
        {
            System.out.print("Enter your Guess=");
            int guess=sc.nextInt();
            if(guess==number){
                System.out.println("CONGRATULATIONS!Your Guess was Right");
                guessed=true;
                break;
            }
            else if(guess<number){
                System.out.println("Your guess number" + guess + "is LESSER than the actual number");
            }
            else{
                System.out.println("Your guess number" + guess + "is GREATER than actual number");
            }}
            if(!guessed){
            System.out.println("Your attemps are over");
            System.out.println("The correct number was"+number);}
            
            sc.close();
        }}




    

