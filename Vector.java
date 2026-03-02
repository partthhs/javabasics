import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        
        v.add(10);
        v.add(20);
        v.add(30);

      
        System.out.println("Vector: " + v);

       
        System.out.println("First element: " + v.get(0));

       
        v.remove(1);

        System.out.println("After removal: " + v);
    }
}