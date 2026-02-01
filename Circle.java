import java.util.Scanner;
class Circle {
    public static void main (String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THE RADIUS=");
        float RADIUS=sc.nextInt();
        float AREA=3.14f*RADIUS*RADIUS;
        System.out.println("AREA IS="+AREA);
    }
}
