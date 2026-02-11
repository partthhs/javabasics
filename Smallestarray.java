public class Smallestarray {
    public static void main(String[]args)
    {
        int[] arr = {2,56,89,34,56,1,55};//initialize
        int min = arr[0];//assume min number as the first one 

        for(int i = 1; i<arr.length; i++)//loop starts from 1 to compare
        {
            if(arr[i]<arr[0])
            {
                min = arr[i];
            }
        }
        System.out.println("Smallest number is = "+min);
    }
    
}
